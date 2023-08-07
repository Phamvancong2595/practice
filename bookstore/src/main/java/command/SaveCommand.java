package command;

import app.BookApplication;
import pool.ConnectionPool;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SaveCommand<E> extends AbstractCommand{
    private E entity;
    public SaveCommand<E> entity(E entity) {
        this.entity = entity;
        return this;
    }
   @Override
    protected PreparedStatement createStatement(Connection connection) throws Exception {
        final Class<?> entityType = entity.getClass();
        final Field[] fields = entityType.getDeclaredFields();
        final String tableName = entityType.getSimpleName();
        final StringBuilder insertFields = new StringBuilder();
        final StringBuilder paraMarks = new StringBuilder();
        for (int i = 1; i < fields.length; ++i) {
            insertFields.append(fields[i].getName());
            paraMarks.append('?');
            if (i < fields.length - 1) {
                insertFields.append(", ");
                paraMarks.append(", ");
            }
        }
        final String query =
                "INSERT INTO " + tableName +
                        " (" + insertFields + ") VALUE(" + paraMarks + ')';
        final PreparedStatement statement = connection.prepareStatement(
                query,
                Statement.RETURN_GENERATED_KEYS
        );
        for (int i = 1;  i < fields.length; ++i) {
            fields[i].setAccessible(true);
            statement.setObject(i, fields[i].get(entity));
        }
        return statement;
   }
    @Override
    protected E executeStatement(
            PreparedStatement statement
    ) throws Exception {
        statement.executeUpdate();
        final Class<?> entityType = entity.getClass();
        final Field[] fields = entityType.getDeclaredFields();
        final Field idField = fields[0];
        idField.setAccessible(true);
        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                idField.set(entity, generatedKeys.getLong(1));
            }
        }
        return entity;
    }
}
