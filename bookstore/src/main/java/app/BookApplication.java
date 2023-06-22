import entity.Author;
import entity.Book;
import entity.Category;
import lombok.Getter;
import repository.AuthorRepository;
import repository.BookRepository;
import repository.CategoryRepository;
import repository.ConnectionFactory;
import repository.impl.ConnectionFactoryImpl;
import repository.DatabaseContext;
import repository.impl.DatabaseContextImpl;

public final class BookApplication {
    @Getter
    private final ConnectionFactory connectionFactory;
    @Getter
    private final DatabaseContext databaseContext;
    private static final BookApplication INSTANCE = new BookApplication();
    private BookApplication(){
        connectionFactory = new ConnectionFactoryImpl();
        databaseContext = new DatabaseContextImpl();
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

        final Author author = new Author();
        author.setName("CongPV");
        authorRepository.save(author);

        final Category category = new Category();
        category.setName("Economic");
        categoryRepository.save(category);

        final Book book = new Book();
        book.setName("How an economic grow and why it crash !");
        book.setAuthorId(author.getId());
        book.setCategoryId(category.getId());
        bookRepository.save(book);
    }
}
