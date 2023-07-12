package repository;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection connection() throws Exception;
}
