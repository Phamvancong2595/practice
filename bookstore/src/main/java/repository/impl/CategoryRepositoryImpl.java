package repository.category;

import app.BookApplication;
import app.entity.Category;
import repository.connect.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CategoryRepositoryImpl implements CategoryRepository {
    private final ConnectionFactory connectionFactory =
            BookApplication
                    .getInstance()
                    .getConnectionFactory();
    @Override
    public void save(Category category) throws Exception {
        final String query =
                "INSERT INTO Category(name) VALUE(?)";
        try (Connection connection =
                     connectionFactory.connection()) {
            try (
                    PreparedStatement statement =
                            connectionFactory.connection().prepareStatement(
                                    query,
                                    Statement.RETURN_GENERATED_KEYS
                            )
            ) {
                statement.setString(1, category.getName());
                statement.executeUpdate();
                try (
                        ResultSet generatedKeys = statement.getGeneratedKeys()
                ) {
                    if (generatedKeys.next()) {
                        category.setId(
                                generatedKeys.getLong(1)
                        );
                    }
                }

            }

        }
    }
}
