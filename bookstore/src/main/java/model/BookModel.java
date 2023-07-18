package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookModel {
    private int id;
    private String name;
    private AuthorModel author;
}
