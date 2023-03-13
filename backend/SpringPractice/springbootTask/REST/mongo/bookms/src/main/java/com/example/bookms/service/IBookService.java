package com.example.bookms.service;

import com.example.bookms.dto.AddBookRequest;
import com.example.bookms.dto.BookDetails;
import com.example.bookms.entity.Book;
import com.example.bookms.exception.BookNotFoundException;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
@Validated
public interface IBookService {
    BookDetails addBooks(@Valid AddBookRequest request);
    Book findById(@Length(min=3) String id) throws BookNotFoundException;
    BookDetails findBookById(@Length(min=3) String id) throws BookNotFoundException;
    List<BookDetails> findByName(@Length(min=3) String name);
    List<BookDetails> findByNameAndAuthor(@Length(min=3) String name,@Length(min=3) String author);
    BookDetails updatePrice(@Length(min=3) String id,@Min(10) double price) throws BookNotFoundException;
    List<BookDetails> findAll();
    void deleteBook(@Length(min=3) String id) throws BookNotFoundException;
}
