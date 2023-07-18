package service;

import app.BookApplication;
import entity.Author;
import model.AuthorModel;
import model.BookModel;
import repository.AuthorRepository;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorService {
    public List<AuthorModel> getAuthors() throws Exception {
        final BookApplication bookApplication = BookApplication.getInstance();
        final AuthorRepository authorRepository = bookApplication
                .getDatabaseContext()
                .newRepository(Author.class);
        final BookService bookService = bookApplication
                .getServiceProvider()
                .getService(BookService.class);
        final List<Author> authorEntities = authorRepository
                .findAll();
        final List<BookModel> bookModels = bookService.getBooks();
        final Map <Long, List<BookModel>> bookByAuthorId = new HashMap<>();
        for (BookModel book: bookModels) {
            if (book.getAuthor() == null) {
                continue;
            }
            bookByAuthorId
                    .computeIfAbsent(book.getAuthor().getId(), k -> new ArrayList<>())
                    .add(book);
        }
        return authorEntities
                .stream()
                .map(entity -> {
                    final AuthorModel model = new AuthorModel();
                    model.setId(entity.getId());
                    model.setName(entity.getName());
                    model.setCode(entity.getCode());
                    model.setBooks(bookByAuthorId.get(entity.getId()));
                    return model;
                })
                .collect(Collectors.toList());
    }


}
