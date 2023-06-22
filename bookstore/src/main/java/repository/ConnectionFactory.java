package repository.connect;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection connection() throws Exception;
}
