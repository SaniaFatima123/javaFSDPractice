package com.example.bookms.controller;

import com.example.bookms.dto.AddBookRequest;
import com.example.bookms.dto.BookDetails;
import com.example.bookms.exception.BookNotFoundException;
import com.example.bookms.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public BookDetails addBook(@RequestBody AddBookRequest request) {
        BookDetails response = service.addBooks(request);
        return response;
    }

    @GetMapping("/find/byid/{id}")
    public BookDetails findById(@PathVariable String id) throws Exception {
        BookDetails response = service.findBookById(id);
        return response;
    }

    @GetMapping("/find/byname/{name}")
    public List<BookDetails> findByName(@PathVariable String name) {
        List<BookDetails> response = service.findByName(name);
        return response;
    }

    @GetMapping("/find/bynameandauthor/{name}/{author}")
    public List<BookDetails> findByNameAndAuthor(@PathVariable String name, @PathVariable String author) {
        List<BookDetails> response = service.findByNameAndAuthor(name, author);
        return response;
    }

    @GetMapping("/all")
    public List<BookDetails> findAll() {
        List<BookDetails> response = service.findAll();
        return response;
    }

    @PutMapping("/update/{id}/{price}")
    public BookDetails update(@PathVariable String id, @PathVariable double price) throws Exception {
        BookDetails response = service.updatePrice(id, price);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String delete(@PathVariable String id) throws Exception {
        service.deleteBook(id);
        return "Book deleted with id "+id;
    }
}

