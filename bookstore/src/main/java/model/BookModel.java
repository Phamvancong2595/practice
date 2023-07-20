package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookModel implements Cloneable{
    private int id;
    private String name;
    private AuthorModel author;
    @Override
    public BookModel clone() {
        final BookModel clone = new BookModel();
        clone.id = id;
        clone.name = name;
        clone.author = author;
        return clone;
    }
}
