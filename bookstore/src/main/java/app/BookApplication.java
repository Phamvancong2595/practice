package app;

import builder.AuthorBuilder;
import builder.BookBuilder;
import builder.CategoryBuilder;
import command.CommandProvider;
import entity.Author;
import entity.Book;
import entity.Category;
import factory.EntityFactory;
import factory.impl.EntityFactoryImpl;
import interpreter.InterpreterProvider;
import lombok.Getter;
import pool.ConnectionPool;
import repository.AuthorRepository;
import repository.BookRepository;
import repository.CategoryRepository;
import repository.ConnectionFactory;
import repository.impl.ConnectionFactoryImpl;
import repository.DatabaseContext;
import repository.impl.DatabaseContextImpl;

public final class BookApplication {
    @Getter
    private final EntityFactory entityFactory;
    @Getter
    private final ConnectionFactory connectionFactory;
    @Getter
    private final DatabaseContext databaseContext;
    @Getter
    private final ConnectionPool connectionPool;
    @Getter
    private final CommandProvider commandProvider;
    @Getter
    private final InterpreterProvider interpreterProvider;
    private static final BookApplication INSTANCE = new BookApplication();

    private BookApplication() {
        this.connectionPool = new ConnectionPool();
        entityFactory = new EntityFactoryImpl();
        connectionFactory = new ConnectionFactoryImpl();
        databaseContext = new DatabaseContextImpl();
        commandProvider = new CommandProvider();
        interpreterProvider = new InterpreterProvider();
    }

    public static BookApplication getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        final BookApplication application = BookApplication.getInstance();
        final DatabaseContext databaseContext = application.getDatabaseContext();
        final AuthorRepository authorRepository = databaseContext.newRepository(Author.class);
        final CategoryRepository categoryRepository = databaseContext.newRepository(Category.class);
        final BookRepository bookRepository = databaseContext.newRepository(Book.class);
        final EntityFactory entityFactory = application.getEntityFactory();
//        final Author author = entityFactory.newEntity(
//                Author.class,
//                "CongPV"
//        );
//        final Category category = entityFactory.newEntity(
//                Category.class,
//                "Economic"
//        );
//        final Book book = entityFactory.newEntity(
//                Book.class,
//                "How an economic grow and why it crash !"
//        );
//        book.setAuthorId(author.getId());
//        book.setCategoryId(category.getId());
        final Author author = entityFactory
                .newEntityBuilder(AuthorBuilder.class)
                .name("Cong")
                .build();
        final Category category = entityFactory
                .newEntityBuilder(CategoryBuilder.class)
                .name("Economic")
                .build();
        final Book book = entityFactory
                .newEntityBuilder(BookBuilder.class)
                .name("How an economic grow and why it crash")
                .authorId(author.getId())
                .categoryId(category.getId())
                .build();
        authorRepository.save(author);
        categoryRepository.save(category);
        bookRepository.save(book);
    }
}
