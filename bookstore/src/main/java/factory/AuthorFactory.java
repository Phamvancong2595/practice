package factory;

import builder.AuthorBuilder;
import entity.Author;

public interface AuthorFactory {
    Author newAuthor(String name);
    AuthorBuilder newAuthorBuilder();
}
