package controller;

import app.BookApplication;
import builder.BookBuilder;
import com.tvd12.ezyhttp.core.exception.HttpBadRequestException;
import com.tvd12.ezyhttp.core.response.ResponseEntity;
import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoPost;
import com.tvd12.ezyhttp.server.core.annotation.RequestBody;
import entity.Book;
import factory.EntityFactory;
import handler.ChainOfResponsibility;
import repository.BookRepository;
import request.AddBookRequest;
import response.AddAuthorResponse;
import response.AddBookResponse;

import java.util.HashMap;
import java.util.Map;

import static com.tvd12.ezyfox.io.EzyStrings.isBlank;

@Controller("/api/vi")
public class ApiBookController {
    private final BookApplication bookApplication =
            BookApplication.getInstance();
    private final EntityFactory entityFactory =
            bookApplication.getEntityFactory();
    private final BookRepository bookRepository =
            bookApplication
                    .getDatabaseContext()
                    .newRepository(Book.class);
    @DoPost("/books/add")
    public ResponseEntity addBook(@RequestBody AddBookRequest request) throws Exception {
        return new ChainOfResponsibility()
                .addFirstVoidHandler(() -> {
                    final Map<String, String> errors = new HashMap<>();
                    if (isBlank(request.getBookName())) {
                        errors.put("authorName", "required");
                    }
                    if (request.getAuthorId() <= 0) {
                        errors.put("authorId", "required");
                    }
                    if (request.getCategoryId() <= 0) {
                        errors.put("categoryId", "required");
                    }
                    if (!errors.isEmpty()) {
                        throw new HttpBadRequestException(errors);
                    }
                })
                .addFirstHandle(() -> {
                    final Book book = entityFactory
                            .newEntityBuilder(BookBuilder.class)
                            .name(request.getBookName())
                            .authorId(request.getAuthorId())
                            .build();
                    bookRepository.save(book);
                    return new AddBookResponse(book.getId());
                })
                .handle();
    }
}
