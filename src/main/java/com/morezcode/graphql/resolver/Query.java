package com.morezcode.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.morezcode.graphql.model.Author;
import com.morezcode.graphql.model.Book;
import com.morezcode.graphql.repository.AuthorRepository;
import com.morezcode.graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Query implements GraphQLQueryResolver {
    final private BookRepository bookRepository;
    final private AuthorRepository authorRepository;

    @Autowired
    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }
    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
    public Book getBook(Long bookId) { return bookRepository.findOne(bookId);}
}
