package app.factory;

import app.entity.Book;

public interface BookFactory {
    Book newBook(String name);
}
