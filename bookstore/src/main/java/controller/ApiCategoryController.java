package controller;

import app.BookApplication;
import builder.CategoryBuilder;
import com.tvd12.ezyhttp.core.exception.HttpBadRequestException;
import com.tvd12.ezyhttp.core.response.ResponseEntity;
import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoPost;
import com.tvd12.ezyhttp.server.core.annotation.RequestBody;
import entity.Category;
import factory.CategoryFactory;
import factory.EntityFactory;
import handler.ChainOfResponsibility;
import repository.CategoryRepository;
import request.AddCategoryRequest;
import response.AddCategoryResponse;

import java.util.HashMap;
import java.util.Map;

import static com.tvd12.ezyfox.io.EzyStrings.isBlank;

@Controller("/api/v1")
public class ApiCategoryController {
    private final BookApplication application = BookApplication.getInstance();
    private final EntityFactory entityFactory = application.getEntityFactory();
    private final CategoryRepository categoryRepository = application
            .getDatabaseContext()
            .newRepository(Category.class);
    @DoPost("/categories/add")
    public ResponseEntity addCategory(@RequestBody AddCategoryRequest request) throws Exception {
        return new ChainOfResponsibility()
                .addFirstVoidHandler(() -> {
                    final Map<String, String> errors = new HashMap<>();
                    if (isBlank(request.getCategoryName())) {
                        errors.put("categoryName", "required");
                    }
                    if (!errors.isEmpty()) {
                        throw new HttpBadRequestException(errors);
                    }
                })
                .addFirstHandle(() -> {
                    final Category category = entityFactory
                            .newEntityBuilder(CategoryBuilder.class)
                            .name(request.getCategoryName())
                            .build();
                    categoryRepository.save(category);
                    return new AddCategoryResponse(category.getId());
                })
                .handle();
    }
}
