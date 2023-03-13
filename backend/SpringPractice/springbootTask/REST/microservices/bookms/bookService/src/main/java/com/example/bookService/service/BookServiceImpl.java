package com.example.bookService.service;

import com.example.bookService.entity.Book;
import com.example.bookService.exception.BookNotFoundException;
import com.example.bookService.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookRepository repository;
    @Override
    public Book add(Book book) {
        String bookId = UUID.randomUUID().toString();
        book.setBookId(bookId);
        return repository.save(book);
    }

    @Override
    public Book findByBookId(String bookId) {
        Book book = repository.findById(bookId).orElseThrow(()->new BookNotFoundException("Book not found with id "+bookId));
        return book;
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }
}
