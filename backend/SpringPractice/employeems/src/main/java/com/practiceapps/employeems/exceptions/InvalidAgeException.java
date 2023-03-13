package com.practiceapps.employeems.exceptions;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
