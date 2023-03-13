package com.example.studentms.exception;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException(String msg){
        super(msg);
    }
}
