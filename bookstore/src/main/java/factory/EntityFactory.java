package entity;

public interface EntityFactory {
    <E> E newEntity(Class<E> entity, String name);
}
