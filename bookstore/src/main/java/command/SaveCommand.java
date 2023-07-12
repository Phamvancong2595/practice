package command;

import app.BookApplication;
import pool.ConnectionPool;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SaveCommand<E> implements NoReturnCommand {
    private E entity;
    public SaveCommand<E> entity(E entity) {
        this.entity = entity;
        return this;
    }
    @Override
    public void voidExecute() throws Exception {
        final Class<?> entityType = entity.getClass();
        final Field[] fileds = entityType.getDeclaredFields();
        final String tableName = entityType.getSimpleName();
        final StringBuilder insertFields = new StringBuilder();
        final StringBuilder paramMarks = new StringBuilder();
        for (int i = 1; i < fileds.length; ++i) {
            insertFields.append(fileds[i].getName());
            paramMarks.append('?');
            if (i < fileds.length - 1) {
                insertFields.append(", ");
                paramMarks.append(", ");
            }
        }
        final String query =
                "INSERT INTO " + tableName + "(" + insertFields + ") VALUE(" + paramMarks + ')';
        final ConnectionPool connectionPool = BookApplication
                .getInstance()
                .getConnectionPool();
        final Connection connection = connectionPool.provide();
        try {
            try(PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                for (int i = 1; i < fileds.length; ++i) {
                    fileds[i].setAccessible(true);
                    statement.setObject(i, fileds[i].get(entity));
                }
                statement.executeUpdate();
                final Field idField = fileds[0];
                idField.setAccessible(true);
                try(ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        idField.set(entity, generatedKeys.getLong(1));
                    }
                }
            }
        } finally {
            connectionPool.pushBack(connection);
        }
    }
}
