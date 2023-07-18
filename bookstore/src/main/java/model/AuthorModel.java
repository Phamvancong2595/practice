package model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuthorModel {
    private long id;
    private String name;
    private String code;
    private List<BookModel> books;
}
