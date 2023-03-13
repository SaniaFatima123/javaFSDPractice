package com.example.bookms.service;

import com.example.bookms.dto.AddBookRequest;
import com.example.bookms.dto.BookDetails;
import com.example.bookms.dto.ChangePriceRequest;
import com.example.bookms.entity.Book;
import com.example.bookms.exception.BookNotFoundException;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public interface IBookService {
    BookDetails addBook(@Valid AddBookRequest requestData);
    Book findById(@Min(1) int id)throws BookNotFoundException;
    BookDetails findBookDetailsById(@Min(1) int id)throws BookNotFoundException;
    List<BookDetails> findByName(@Length(min = 2,max = 20) String name);
    BookDetails changePrice(@Min(1) int id, ChangePriceRequest priceRequest) throws BookNotFoundException;
    List<BookDetails> findAll();
    String deleteBook(@Min(1) int id) throws BookNotFoundException;
}
