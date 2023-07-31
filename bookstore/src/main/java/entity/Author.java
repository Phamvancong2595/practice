package entity;

import lombok.Data;

@Data
public class Author implements  Cloneable{
    private long id;
    private String name;
    private String level;
    private String code;

    @Override
    public Author clone() {
        final Author author = new Author();
        author.name = name;
        return author;
    }
}
