package com.example.bookms.controller;

import com.example.bookms.dto.AddBookRequest;
import com.example.bookms.dto.BookDetails;
import com.example.bookms.dto.ChangePriceRequest;
import com.example.bookms.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {
    @Autowired
    private IBookService bookService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addbook")
    public BookDetails addBook(@RequestBody AddBookRequest request){
       BookDetails bookDetails =  bookService.addBook(request);
       return bookDetails;
    }

    @GetMapping("/findbyid/{id}")
    public BookDetails findBookById(@PathVariable int id) throws Exception{
        BookDetails response = bookService.findBookDetailsById(id);
        return response;
    }

    @GetMapping("/findbyname/{name}")
    public List<BookDetails> findBookByName(@PathVariable String name){
        List<BookDetails> response = bookService.findByName(name);
        return response;
    }

    @PutMapping("/update/price/{id}")
    public BookDetails updatePrice(@PathVariable int id, @RequestBody ChangePriceRequest request) throws  Exception{
       BookDetails bookDetails = bookService.changePrice(id,request);
       return bookDetails;
    }

    @GetMapping("/findall")
    public List<BookDetails> findAllBook(){
        List<BookDetails> response = bookService.findAll();
        return response;
    }

    @DeleteMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable  int id) throws Exception{
        String msg = bookService.deleteBook(id);
        return msg;
    }
}
