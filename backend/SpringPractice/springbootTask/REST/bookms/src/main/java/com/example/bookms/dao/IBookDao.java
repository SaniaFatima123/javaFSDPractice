package com.example.bookms.dao;

import com.example.bookms.entity.Book;

import java.util.List;

public interface IBookDao {
    Book save(Book book);
    Book findById(int id);
    List<Book> findByName(String name);
    List<Book> findAll();
    String delete(Book book);

}
