package repository.impl;

import command.IterableCommand;
import command.SaveCommand;
import designpattern.initiate.factory.Application;
import entity.Book;
import pool.ConnectionPool;
import repository.BookRepository;
import repository.ConnectionFactory;
import app.BookApplication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class BookRepositoryImpl implements BookRepository {
    @Override
    public void save(Book book) throws Exception {
        final SaveCommand<Book> command = BookApplication
                .getInstance()
                .getCommandProvider()
                .provide(SaveCommand.class);
        command.entity(book)
                .execute();
    }

    @Override
    public void forEach(Consumer<Book> consumer) throws Exception {
        final IterableCommand<Book> command = BookApplication
                .getInstance()
                .getCommandProvider()
                .provide(IterableCommand.class);
        final Iterable<Book> iterable = command
                .entitiType(Book.class)
                .execute();
        for (Book book: iterable) {
            consumer.accept(book);
        }
    }

//    private final ConnectionFactory connectionFactory =
//            BookApplication.getInstance().getConnectionFactory();

//    @Override
//    public void save(Book book) throws Exception {
//        final ConnectionPool connectionPool = BookApplication.getInstance().getConnectionPool();
//        final Connection connection = connectionPool.provide();
//        final String query =
//                "INSERT INTO Book (name, authorId, categoryId) VALUE(?, ?, ?)";
//        try  {
//            try(
//                    PreparedStatement statement = connection.prepareStatement(
//                            query,
//                            Statement.RETURN_GENERATED_KEYS
//                    )
//            ) {
//                statement.setString(1, book.getName());
//                statement.setLong(2, book.getAuthorId());
//                statement.setLong(3, book.getCategoryId());
//                statement.executeUpdate();
//                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
//                    if (generatedKeys.next()) {
//                        book.setId(generatedKeys.getLong(1));
//                    }
//                }
//            }
//        } finally {
//            connectionPool.pushBack(connection);
//        }
//    }
}