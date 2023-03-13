package com.example.employeems.exception;

public class InvalidSalaryException extends RuntimeException {
    public InvalidSalaryException(String salary_is_invalid) {
        super(salary_is_invalid);
    }
}
