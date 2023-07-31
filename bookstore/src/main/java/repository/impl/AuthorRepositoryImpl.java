package repository.impl;


import app.BookApplication;
import entity.Author;
import pool.ConnectionPool;
import repository.AuthorRepository;
import repository.BookRepository;
import entity.Book;
import strategy.AuthorLevelStrategyContext;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AuthorRepositoryImpl implements AuthorRepository {

    @Override
    public void updateAuthorLevel(long authorId) throws Exception {
        final Author author = findById(authorId);
        if (author == null) {
            return;
        }
        final BookApplication bookApplication = BookApplication.getInstance();
        final BookRepository bookRepository = bookApplication
                .getDatabaseContext()
                .newRepository(Book.class);
        final long bookCount = bookRepository.countBookByAuthorId(authorId);
        final AuthorLevelStrategyContext authorLevelStrategyContext = bookApplication
                .getStrategyProvide()
                .getTrategy(AuthorLevelStrategyContext.class);
        final String authorLevel = authorLevelStrategyContext.decideAuthorLevel(bookCount);
        final String query = "UPDATE Author SET level = ? WHERE id = ?";
        final ConnectionPool connectionPool = BookApplication
                .getInstance().getConnectionPool();
        Connection connection = connectionPool.provide();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, authorLevel);
        statement.setLong(2, authorId);
        statement.executeUpdate();
    }
}
