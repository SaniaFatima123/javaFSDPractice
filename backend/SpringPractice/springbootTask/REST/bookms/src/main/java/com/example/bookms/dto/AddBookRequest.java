package com.example.bookms.dto;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public class AddBookRequest {
    @NotNull
    @Length(min=2, max=20, message ="name length should be between 2 and 20")
    private String name;
    @Min(20)
    private double price;

    public AddBookRequest() {
    }

    public AddBookRequest(String name, double price) {
        this.name = name;
        this.price = price;
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
}
