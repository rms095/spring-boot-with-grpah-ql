package com.morezcode.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.morezcode.graphql.model.Author;
import com.morezcode.graphql.model.Book;
import com.morezcode.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookResolver implements GraphQLResolver<Book> {

    @Autowired
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}
