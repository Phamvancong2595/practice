package controller;

import app.BookApplication;
import builder.AuthorBuilder;
import com.tvd12.ezyhttp.core.exception.HttpBadRequestException;
import com.tvd12.ezyhttp.core.response.ResponseEntity;
import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoGet;
import com.tvd12.ezyhttp.server.core.annotation.DoPost;
import com.tvd12.ezyhttp.server.core.annotation.RequestBody;
import entity.Author;
import factory.EntityFactory;
import handler.ChainOfResponsibility;
import interpreter.AuthorCodeInterpreter;
import repository.AuthorRepository;
import request.AddAuthorRequest;
import response.AddAuthorResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.tvd12.ezyfox.io.EzyStrings.isBlank;

@Controller("/api/v1")
public class ApiAuthorController {
    private final BookApplication bookApplication = BookApplication.getInstance();
    private final EntityFactory entityFactory = bookApplication.getEntityFactory();
    private final AuthorRepository authorRepository =
            bookApplication.getDatabaseContext()
                    .newRepository(Author.class);
    @DoPost("/authors/add")
    public ResponseEntity addAuthor(@RequestBody AddAuthorRequest request) throws Exception {
        return new ChainOfResponsibility()
                .addFirstVoidHandler(() -> {
                    final Map<String, String> errors = new HashMap<>();
                    if (isBlank(request.getAuthorName())) {
                        errors.put("authorName", "required");
                    }
                    if (!errors.isEmpty()) {
                        throw new HttpBadRequestException(errors);
                    }
                })
                .addFirstHandle(() -> {
                    final String code = BookApplication
                            .getInstance()
                            .getInterpreterProvider()
                            .getInterpreter(AuthorCodeInterpreter.class)
                            .translate(request.getAuthorName());
                    final Author author = entityFactory
                            .newEntityBuilder(AuthorBuilder.class)
                            .name(request.getAuthorName())
                            .code(code)
                            .build();
                    authorRepository.save(author);
                    return new AddAuthorResponse(author.getId());
                })
                .handle();
    }
    @DoGet("/authors")
    public List<Author> getAuthors() throws Exception {
        return authorRepository.findAll();
    }
}
