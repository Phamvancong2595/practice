package builder;

import entity.Book;

public class BookBuilder implements Builder<Book>{
    private long id;
    private String name;
    private long authorId;
    private long categoryId;
    public BookBuilder id(long id) {
        this.id = id;
        return this;
    }
    public BookBuilder name(String name) {
        this.name = name;
        return this;
    }
    public BookBuilder authorId(long authorId) {
        this.authorId = authorId;
        return this;
    }
    public BookBuilder categoryId(long id) {
        this.categoryId = id;
        return this;
    }
    @Override
    public Book build() {
        Book book = new Book();
        book.setCategoryId(categoryId);
        book.setId(id);
        book.setAuthorId(authorId);
        book.setName(name);
        return book;
    }
}
