package repository.impl;

import app.BookApplication;
import command.IterableCommand;
import command.SaveCommand;
import designpattern.behavior.iterator.v1.Application;
import entity.Author;
import pool.ConnectionPool;
import repository.AuthorRepository;
import repository.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class AuthorRepositoryImpl implements AuthorRepository {
    @Override
    public void save(Author author) throws Exception {
        final SaveCommand<Author> command = BookApplication
                .getInstance()
                .getCommandProvider()
                .provide(SaveCommand.class);
        command
                .entity(author)
                .execute();
    }

    @Override
    public void forEach(Consumer<Author> consumer) throws Exception {
            final IterableCommand<Author> command = BookApplication
                    .getInstance()
                    .getCommandProvider()
                    .provide(IterableCommand.class);
            final Iterable<Author> iterable = command
                    .entitiType(Author.class)
                    .execute();
            for (Author author: iterable) {
                consumer.accept(author);
            }
    }
//    private final ConnectionFactory connectionFactory =
//            BookApplication
//                    .getInstance()
//                    .getConnectionFactory();
//
//    @Override
//    public void save(Author author) throws Exception {
//        final String query =
//                "INSERT INTO Author(name) value (?)";
//        final ConnectionPool connectionPool = BookApplication
//                .getInstance()
//                .getConnectionPool();
//        final Connection connection = connectionPool.provide();
//        try  {
//            try (
//                    PreparedStatement statement =
//                           connection.prepareStatement(
//                                    query,
//                                    Statement.RETURN_GENERATED_KEYS
//                            )
//            ) {
//                statement.setString(1, author.getName());
//                statement.executeUpdate();
//                try (
//                        ResultSet generatedKeys = statement.getGeneratedKeys()
//                ) {
//                    if (generatedKeys.next()) {
//                        author.setId(
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
