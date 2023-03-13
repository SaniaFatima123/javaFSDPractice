package com.example.employeems.exception;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException(String msg){
        super(msg);
    }
}
