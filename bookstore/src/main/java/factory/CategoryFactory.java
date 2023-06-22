package app.factory;

import app.entity.Category;

public interface CategoryFactory {
    Category newCategory(String name);
}
