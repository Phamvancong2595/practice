package app.factory;

import app.entity.Author;

public interface AuthorFactory {
    Author newAuthor(String name);
}
