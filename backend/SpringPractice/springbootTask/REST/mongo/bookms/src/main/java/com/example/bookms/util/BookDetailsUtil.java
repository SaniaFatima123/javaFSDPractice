package com.example.bookms.util;

import com.example.bookms.dto.BookDetails;
import com.example.bookms.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookDetailsUtil {
    public BookDetails toBookDetails(Book book){
        BookDetails bookDetails = new BookDetails(book.getId(), book.getName(), book.getPrice(), book.getAuthor());
        return bookDetails;
    }
    public List<BookDetails> toBookDetails(List<Book> books){
        List<BookDetails> bookList = new ArrayList<>();
        for(Book book:books){
            BookDetails bookDetails = new BookDetails(book.getId(), book.getName(), book.getPrice(), book.getAuthor());
            bookList.add(bookDetails);
        }

        return bookList;
    }
}
