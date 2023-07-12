package repository.impl;

import entity.Author;
import entity.Book;
import entity.Category;
import repository.Repository;
import repository.DatabaseContext;

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
