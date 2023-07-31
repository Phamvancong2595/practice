package repository;

import entity.Book;

public interface BookRepository extends Repository<Book> {
    long countBookByAuthorId(long authorId) throws Exception;
}
