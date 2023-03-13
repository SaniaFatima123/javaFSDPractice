package com.practiceapp.employeems.exception;

public class InvalidSalaryException extends RuntimeException {
    public InvalidSalaryException(String msg){
        super(msg);
    }
}
