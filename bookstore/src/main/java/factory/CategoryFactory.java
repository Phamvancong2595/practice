package factory;

import builder.CategoryBuilder;
import entity.Category;

public interface CategoryFactory {
    Category newCategory(String name);
    CategoryBuilder newCategoryBuilder();
}
