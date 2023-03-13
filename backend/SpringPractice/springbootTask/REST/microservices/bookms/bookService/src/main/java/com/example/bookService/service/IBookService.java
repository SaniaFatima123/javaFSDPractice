package com.example.bookService.service;

import com.example.bookService.entity.Book;

import java.util.List;

public interface IBookService {
    Book add(Book book);
    Book findByBookId(String bookId);
    List<Book> findAll();
}
