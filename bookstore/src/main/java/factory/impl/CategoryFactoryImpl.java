package factory.impl;

import builder.CategoryBuilder;
import entity.Category;
import factory.CategoryFactory;

public class CategoryFactoryImpl implements CategoryFactory {
    @Override
    public Category newCategory(String name) {
        final Category category = new Category();
        category.setName(name);
        return category;
    }

    @Override
    public CategoryBuilder newCategoryBuilder() {
        return new CategoryBuilder();
    }
}
