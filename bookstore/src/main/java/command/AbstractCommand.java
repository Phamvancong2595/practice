package command;

import app.BookApplication;
import observer.VoidNoReturnObserver;
import pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class AbstractCommand <R> implements Command<R>{
    @Override
    public final R execute() throws Exception {
        final ConnectionPool connectionPool = BookApplication
                .getInstance().getConnectionPool();
        final Connection connection = connectionPool.provide();
        final PreparedStatement statement = createStatement(connection);
        try {
            return executeStatement(statement, () -> {
                try {
                    statement.close();
                } catch (SQLException ignored) {

                } finally {
                    connectionPool.pushBack(connection);
                }
            });
        } finally {
            if (closeStatementAsSoonAsPossible()) {
                try {
                    statement.close();
                } finally {
                    connectionPool.pushBack(connection);
                }
            }
        }
    }
    protected abstract PreparedStatement createStatement(Connection connection) throws Exception;
    protected R executeStatement(PreparedStatement statement, VoidNoReturnObserver finishObserver) throws Exception {
        return executeStatement(statement);
    }
    protected R executeStatement(PreparedStatement statement) throws Exception {
        return null;
    }
    protected boolean closeStatementAsSoonAsPossible() {
        return true;
    }
}
