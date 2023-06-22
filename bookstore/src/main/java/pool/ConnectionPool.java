package pool;

import app.BookApplication;

import java.sql.Connection;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPool {
    private final LinkedBlockingQueue<Connection>
            connectionsQueue = new LinkedBlockingQueue<>();
    private final AtomicInteger
            numberOfCreatedConnections = new AtomicInteger();
    private static final int MAX_CONNECTION = 16;

    public Connection provide() throws Exception {
        synchronized (this) {
            if (numberOfCreatedConnections.get() < MAX_CONNECTION) {
                final Connection connection = BookApplication
                        .getInstance()
                        .getConnectionFactory()
                        .connection();
                numberOfCreatedConnections.incrementAndGet();
                return connection;
            }
        }
        return connectionsQueue.take();
    }

    public void pushBack(Connection connection) {
        connectionsQueue.offer(connection);
    }
}
