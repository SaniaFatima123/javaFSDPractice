package com.example.bookms.dto;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;

@Validated
public class AddBookRequest {
    @Length(min = 3)
    private String name;
    @Min(10)
    private double price;
    @Length(min = 3)
    private String author;

    public AddBookRequest() {

    }

    public AddBookRequest(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
