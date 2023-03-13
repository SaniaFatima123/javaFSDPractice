package com.example.bookms.service;

import com.example.bookms.dao.IBookDao;
import com.example.bookms.dto.AddBookRequest;
import com.example.bookms.dto.BookDetails;
import com.example.bookms.dto.ChangePriceRequest;
import com.example.bookms.entity.Book;
import com.example.bookms.exception.BookNotFoundException;
import com.example.bookms.util.BookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookDao bookDao;
    @Autowired
    private BookUtil bookUtil;

    @Override
    public BookDetails addBook(AddBookRequest requestData) {
        Book book = new Book();
        book.setName(requestData.getName());
        book.setPrice(requestData.getPrice());
        Book added = bookDao.save(book);
        BookDetails bookDetails = bookUtil.toBookDetails(added);
        return bookDetails;
    }

    @Override
    public Book findById(int id) throws BookNotFoundException {
        Book book = bookDao.findById(id);
        if(book==null){
            throw new BookNotFoundException("Book not found for id "+id);
        }
        return book;
    }

    @Override
    public BookDetails findBookDetailsById(int id) throws BookNotFoundException{
        Book book = findById(id);
        BookDetails bookDetails = bookUtil.toBookDetails(book);
        return bookDetails;
    }

    @Override
    public List<BookDetails> findByName(String name) {
        List<Book> books = bookDao.findByName(name);
        List<BookDetails> bookDetails = bookUtil.toBookDetails(books);
        return bookDetails;
    }

    @Override
    public BookDetails changePrice(int id, ChangePriceRequest priceRequest) throws BookNotFoundException {
        Book book = findById(id);
        book.setPrice(priceRequest.getPrice());
        Book updatedBook = bookDao.save(book);
        BookDetails bookDetails = bookUtil.toBookDetails(updatedBook);
        return bookDetails;
    }

    @Override
    public List<BookDetails> findAll() {
        List<Book> found = bookDao.findAll();
        List<BookDetails> bookDetails = bookUtil.toBookDetails(found);
        return bookDetails;
    }

    @Override
    public String deleteBook(int id) throws BookNotFoundException {
        Book book = findById(id);
        String msg = bookDao.delete(book);
        return msg;
    }
}
