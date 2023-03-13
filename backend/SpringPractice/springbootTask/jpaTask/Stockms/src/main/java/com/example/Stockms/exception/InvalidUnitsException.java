package com.example.Stockms.exception;

public class InvalidUnitsException extends RuntimeException {
    public InvalidUnitsException(String name_is_invalid) {
        super(name_is_invalid);
    }
}
