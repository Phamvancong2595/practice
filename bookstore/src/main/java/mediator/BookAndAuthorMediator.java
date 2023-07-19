package mediator;

import app.BookApplication;
import entity.Author;
import entity.Book;
import model.AuthorModel;
import model.BookModel;
import repository.AuthorRepository;
import repository.BookRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookAndAuthorMediator {
    public List<AuthorModel> getAuthors() throws Exception {
        final BookApplication bookApplication = BookApplication.getInstance();
        final AuthorRepository authorRepository = bookApplication
                .getDatabaseContext()
                .newRepository(Author.class);
        final BookRepository bookRepository = bookApplication
                .getDatabaseContext()
                .newRepository(Book.class);
        final List<Author> authorEntities = authorRepository
                .findAll();
        final List<AuthorModel> authorModels = authorEntities
                .stream()
                .map(BookAndAuthorMediator::toAuthorModel)
                .collect(Collectors.toList());
        final Map<Long, AuthorModel> authorById = authorModels
                .stream()
                .collect(Collectors.toMap(AuthorModel::getId, it -> it));
        final List<Book> bookEntities = bookRepository.findAll();
        final List<BookModel> bookModels = bookEntities
                .stream()
                .map(entity -> toBookModel(entity, authorById.get(entity.getAuthorId())))
                .collect(Collectors.toList());
        final Map<Long, List<BookModel>> booksByAuthorId = new HashMap<>();
        for (BookModel book: bookModels) {
            if (book.getAuthor() == null) {
                continue;
            }
            booksByAuthorId
                    .computeIfAbsent(book.getAuthor().getId(), k -> new ArrayList<>())
                    .add(book);
        }
        return authorEntities
                .stream()
                .map(entity -> {
                    final AuthorModel model = new AuthorModel();
                    model.setId(entity.getId());
                    model.setName(entity.getName());
                    model.setBooks(booksByAuthorId.get(entity.getId()));
                    return model;
                })
                .collect(Collectors.toList());
    }
    public List<BookModel> getBooks() throws Exception {
        final BookApplication application = BookApplication.getInstance();
        final BookRepository bookRepository = application
                .getDatabaseContext()
                .newRepository(Book.class);
        final List<Book> bookEntities = bookRepository.findAll();
        final List<AuthorModel> authorEntities = getAuthors();
        final Map<Long, AuthorModel> authorById = authorEntities
                .stream()
                .collect(Collectors.toMap(AuthorModel::getId, it -> it));
        return bookEntities
                .stream()
                .map(entity -> toBookModel(entity , authorById.get(entity.getAuthorId())))
                .collect(Collectors.toList());
    }
    private static AuthorModel toAuthorModel(Author entity) {
        final AuthorModel model = new AuthorModel();
        model.setId(model.getId());
        model.setName(model.getName());
        model.setCode(model.getCode());
        return model;
    }
    private static BookModel toBookModel(Book entity, AuthorModel author) {
        final BookModel model = new BookModel();
        model.setAuthor(author);
        model.setId((int) entity.getId());
        model.setName(entity.getName());
        return model;
    }
}
