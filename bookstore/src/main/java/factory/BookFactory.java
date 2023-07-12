package factory;

import builder.BookBuilder;
import entity.Book;

public interface BookFactory {
    Book newBook(String name);
    BookBuilder newBookBuilder();
}
