package app.factory.impl;

import app.entity.Author;
import app.factory.AuthorFactory;

public class AuthorFactoryImpl implements AuthorFactory {
    @Override
    public Author newAuthor(String name) {
        final Author author = new Author();
        author.setName(name);
        return author;
    }
}
