package repository.database;

import repository.Repository;

public interface DatabaseContext {
    <E, R extends Repository<E>> R newRepository(Class<E> entityType);
}
