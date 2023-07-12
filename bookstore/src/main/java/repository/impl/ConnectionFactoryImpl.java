package repository.impl;

import repository.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactoryImpl implements ConnectionFactory {
    @Override
    public Connection connection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/book_market",
                "root",
                "congpham"
        );
    }
}
