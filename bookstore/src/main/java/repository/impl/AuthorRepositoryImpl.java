package repository.author;

import app.BookApplication;
import app.entity.Author;
import repository.connect.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AuthorRepositoryImpl implements AuthorRepository {
    private final ConnectionFactory connectionFactory =
            BookApplication
                    .getInstance()
                    .getConnectionFactory();

    @Override
    public void save(Author author) throws Exception {
        final String query =
               "INSERT INTO Author(name) value (?)";
        try (Connection connection =
                     connectionFactory.connection()) {
            try (
                    PreparedStatement statement =
                            connectionFactory.connection().prepareStatement(
                                    query,
                                    Statement.RETURN_GENERATED_KEYS
                            )
            ) {
                statement.setString(1, author.getName());
                statement.executeUpdate();
                try (
                        ResultSet generatedKeys = statement.getGeneratedKeys()
                ) {
                    if (generatedKeys.next()) {
                        author.setId(
                                generatedKeys.getLong(1)
                        );
                    }
                }

            }

        }
    }
}
