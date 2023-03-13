package com.example.bookService.controller;

import com.example.bookService.entity.Book;
import com.example.bookService.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookServiceImpl service;
    @PostMapping("/add")
    public ResponseEntity<Book> add(@RequestBody Book book){
        return new ResponseEntity<>(service.add(book), HttpStatus.CREATED);
    }
    @GetMapping("/findbook/bybookid")
    public Book findById(@RequestParam String bookId){
        return service.findByBookId(bookId);
    }
    @GetMapping("/findall")
    public List<Book> findAll(){
        return service.findAll();
    }
}
