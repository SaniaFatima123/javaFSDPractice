package com.example.bookms.exception;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String book_not_found) {
        super(book_not_found);
    }
}
