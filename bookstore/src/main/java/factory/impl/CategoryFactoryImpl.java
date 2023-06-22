package app.factory.impl;

import app.entity.Category;
import app.factory.CategoryFactory;

public class CategoryFactoryImpl implements CategoryFactory {
    @Override
    public Category newCategory(String name) {
        final Category category = new Category();
        category.setName(name);
        return category;
    }
}
