package model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuthorModel implements Cloneable{
    private long id;
    private String name;
    private String code;
    private List<BookModel> books;
    @Override
    public AuthorModel clone() {
        final AuthorModel clone = new AuthorModel();
        clone.id = id;
        clone.name = name;
        clone.code = code;
        clone.books = books;
        return clone;
    }
}
