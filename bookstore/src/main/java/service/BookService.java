package service;

import app.BookApplication;
import entity.Book;
import model.AuthorModel;
import model.BookModel;
import repository.BookRepository;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    public List<BookModel> getBooks() throws Exception {
        final BookApplication bookApplication =  BookApplication.getInstance();
        final BookRepository bookRepository = bookApplication
                .getDatabaseContext()
                .newRepository(Book.class);
        final AuthorService authorService = bookApplication
                .getServiceProvider()
                .getService(AuthorService.class);
        final List<Book> bookEntities =bookRepository.findAll();
        final List<AuthorModel> authorEntities =authorService.getAuthors();
        final Map<Long, AuthorModel> authorById = authorEntities
                .stream()
                .collect(Collectors.toMap(AuthorModel::getId, it -> it));
        return bookEntities
                .stream()
                .map(entity -> {
                    final BookModel model = new BookModel();
                    model.setId((int) entity.getId());
                    model.setName(entity.getName());
                    model.setAuthor(authorById.get(entity.getAuthorId()));
                    return model;
                        }

                )
                .collect(Collectors.toList());
    }
}
