package com.example.Stockms.exception;

public class InvalidIdException extends  RuntimeException{
    public InvalidIdException(String msg){
        super(msg);
    }
}
