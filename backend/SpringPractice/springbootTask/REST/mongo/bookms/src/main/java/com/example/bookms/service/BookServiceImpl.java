package com.example.bookms.service;

import com.example.bookms.dto.AddBookRequest;
import com.example.bookms.dto.BookDetails;
import com.example.bookms.entity.Book;
import com.example.bookms.exception.BookNotFoundException;
import com.example.bookms.repository.BookMongoRepository;
import com.example.bookms.util.BookDetailsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookDetailsUtil util;
    @Autowired
    private BookMongoRepository repository;
    private Random random = new Random();

    public String generateId() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(9);
            builder.append(randomNum);
        }
        String generateId = builder.toString();
        return generateId;
    }


    @Override
    public BookDetails addBooks(AddBookRequest request) {
        Book book = new Book(request.getName(), request.getPrice(), request.getAuthor());
        String id = generateId();
        book.setId(id);
        Book response = repository.save(book);
        BookDetails bookDetails = util.toBookDetails(response);
        return bookDetails;
    }

    @Override
    public Book findById(String id) throws BookNotFoundException {
        Optional<Book> book = repository.findById(id);
        if (!book.isPresent()) {
            throw new BookNotFoundException("Book not found");
        }
        return book.get();
    }

    @Override
    public BookDetails findBookById(String id) throws BookNotFoundException {
        Book book = findById(id);
        BookDetails bookDetails = util.toBookDetails(book);
        return bookDetails;
    }

    @Override
    public List<BookDetails> findByName(String name) {
        List<Book> books = repository.findByName(name);
        List<BookDetails> bookDetailsList = util.toBookDetails(books);
        return bookDetailsList;
    }

    @Override
    public List<BookDetails> findByNameAndAuthor(String name, String author) {
        List<Book> books = repository.findByNameAndAuthor(name, author);
        List<BookDetails> bookDetailsList = util.toBookDetails(books);
        return bookDetailsList;
    }

    @Override
    public BookDetails updatePrice(String id, double price) throws BookNotFoundException {
        Book book = findById(id);
        book.setPrice(price);
        Book updatedBook = repository.save(book);
        BookDetails bookDetails = util.toBookDetails(updatedBook);
        return bookDetails;
    }

    @Override
    public List<BookDetails> findAll() {
        List<Book> books = repository.findAll();
        List<BookDetails> bookDetailsList = util.toBookDetails(books);
        return bookDetailsList;
    }

    @Override
    public void deleteBook(String id) throws BookNotFoundException {
        Book book = findById(id);
        repository.delete(book);
    }
}
