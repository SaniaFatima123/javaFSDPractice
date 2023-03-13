package com.example.userms.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String user_not_found) {
        super(user_not_found);
    }
}
