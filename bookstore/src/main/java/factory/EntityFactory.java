package factory;

import builder.Builder;

import java.awt.image.BufferedImage;

public interface EntityFactory {
    <E> E newEntity(Class<E> entity, String name);
    <E,B extends Builder<E>> B newEntityBuilder(Class<B> builderType);
}
