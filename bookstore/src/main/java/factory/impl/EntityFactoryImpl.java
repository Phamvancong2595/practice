package factory.impl;

import builder.AuthorBuilder;
import builder.BookBuilder;
import builder.Builder;
import builder.CategoryBuilder;
import entity.Author;
import entity.Book;
import entity.Category;
import factory.AuthorFactory;
import factory.BookFactory;
import factory.CategoryFactory;
import factory.EntityFactory;
import factory.impl.AuthorFactoryImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EntityFactoryImpl implements EntityFactory {
    private final AuthorFactory authorFactory = new AuthorFactoryImpl();
    private final CategoryFactory categoryFactory = new CategoryFactoryImpl();
    private final BookFactory bookFactory = new BookFactoryImpl();
    private final Map<Class<?>, Supplier<Builder>> entityBuilderSuppliers;

    public EntityFactoryImpl() {
        entityBuilderSuppliers = new HashMap<>();
        entityBuilderSuppliers.put(
                AuthorBuilder.class,
                AuthorBuilder::new
        );
        entityBuilderSuppliers.put(
                CategoryBuilder.class,
                CategoryBuilder::new
        );
        entityBuilderSuppliers.put(
                BookBuilder.class,
                BookBuilder::new
        );
    }

    @Override
    public <E> E newEntity(Class<E> entity, String name) {
        if (entity == Author.class) {
            return (E) authorFactory.newAuthor(name);
        }
        if (entity == Category.class) {
            return (E) categoryFactory.newCategory(name);
        }
        if (entity == Book.class) {
            return (E) bookFactory.newBook(name);
        }
        throw new IllegalArgumentException("there is no factory for: " + entity);
    }

    @Override
    public <E, B extends Builder<E>> B newEntityBuilder(Class<B> builderType) {
        return (B) entityBuilderSuppliers
                .get(builderType)
                .get();
    }
}
