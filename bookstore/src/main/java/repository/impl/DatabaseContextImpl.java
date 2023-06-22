package repository.database;

import app.entity.Author;
import app.entity.Book;
import app.entity.Category;
import repository.Repository;
import repository.author.AuthorRepositoryImpl;
import repository.book.BookRepositoryImpl;
import repository.category.CategoryRepositoryImpl;

public class DatabaseContextImpl implements DatabaseContext {
    @Override
    public <E, R extends Repository<E>> R newRepository(Class<E> entityType) {
        if (entityType == Author.class) {
            return (R) new AuthorRepositoryImpl();
        }
        if (entityType == Category.class) {
            return (R) new CategoryRepositoryImpl();
        }
        if (entityType == Book.class) {
            return (R) new BookRepositoryImpl();
        }
        throw new IllegalArgumentException("" +
                "There is no repository for" + entityType.getName());
    }
}
