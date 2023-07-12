package factory.impl;

import builder.AuthorBuilder;
import builder.Builder;
import entity.Author;
import factory.AuthorFactory;

public class AuthorFactoryImpl implements AuthorFactory {
    @Override
    public AuthorBuilder newAuthorBuilder() {
        return new AuthorBuilder();
    }
    @Override
    public Author newAuthor(String name) {
        final Author author = new Author();
        author.setName(name);
        return author;
    }


}
