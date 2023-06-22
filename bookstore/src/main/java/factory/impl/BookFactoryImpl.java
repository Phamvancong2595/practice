package app.factory.impl;

import app.entity.Book;
import app.factory.BookFactory;

public class BookFactoryImpl implements BookFactory {
    @Override
    public Book newBook(String name) {
        final Book book = new Book();
        book.setName(name);
        return book;
    }
}
