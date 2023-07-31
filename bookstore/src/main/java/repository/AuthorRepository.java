package repository;

import entity.Author;

public interface AuthorRepository extends Repository<Author> {
    void updateAuthorLevel(long authorId) throws Exception;
}
