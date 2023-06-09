package com.example.ratingService.controller;

import com.example.ratingService.exception.RatingNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(RatingNotFoundException.class)
    public String RatingNotFoundHandler(RatingNotFoundException e){
        return e.getMessage();
    }
}
