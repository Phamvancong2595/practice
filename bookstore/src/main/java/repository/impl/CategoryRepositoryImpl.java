package repository.impl;

import app.BookApplication;
import command.IterableCommand;
import command.SaveCommand;
import entity.Author;
import entity.Category;
import pool.ConnectionPool;
import repository.CategoryRepository;
import repository.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public void save(Category category) throws Exception {
        final SaveCommand<Category> command = BookApplication
                .getInstance()
                .getCommandProvider()
                .provide(SaveCommand.class);
        command
                .entity(category)
                .execute();
    }

    @Override
    public void forEach(Consumer<Category> consumer) throws Exception {
        final IterableCommand<Category> command = BookApplication
                .getInstance()
                .getCommandProvider()
                .provide(IterableCommand.class);
        final Iterable<Category> iterable = command
                .entitiType(Category.class)
                .execute();
        for (Category category: iterable) {
            consumer.accept(category);
        }
    }
//    private final ConnectionFactory connectionFactory =
//            BookApplication
//                    .getInstance()
//                    .getConnectionFactory();
//    @Override
//    public void save(Category category) throws Exception {
//        final ConnectionPool connectionPool = BookApplication.getInstance().getConnectionPool();
//        final Connection connection = connectionPool.provide();
//        final String query =
//                "INSERT INTO Category(name) VALUE(?)";
//        try {
//            try (
//                    PreparedStatement statement =
//                            connection.prepareStatement(
//                                    query,
//                                    Statement.RETURN_GENERATED_KEYS
//                            )
//            ) {
//                statement.setString(1, category.getName());
//                statement.executeUpdate();
//                try (
//                        ResultSet generatedKeys = statement.getGeneratedKeys()
//                ) {
//                    if (generatedKeys.next()) {
//                        category.setId(
//                                generatedKeys.getLong(1)
//                        );
//                    }
//                }
//
//            }
//
//        } finally {
//            connectionPool.pushBack(connection);
//        }
//    }
}
