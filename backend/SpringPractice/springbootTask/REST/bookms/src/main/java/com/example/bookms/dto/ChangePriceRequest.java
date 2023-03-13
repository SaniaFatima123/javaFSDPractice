package com.example.bookms.dto;

import javax.validation.constraints.Min;

public class ChangePriceRequest {
    @Min(1)
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
