package entity;

public class Book implements Cloneable{
    private long id;
    private String name;
    private long authorId;
    private long categoryId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public Book clone() {
        final Book book = new Book();
        book.name = name;
        book.categoryId = categoryId;
        book.authorId = authorId;
        return book;
    }
}
