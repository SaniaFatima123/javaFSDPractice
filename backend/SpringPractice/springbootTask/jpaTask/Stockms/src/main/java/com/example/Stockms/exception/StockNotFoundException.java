package com.example.Stockms.exception;

public class StockNotFoundException extends Exception {
    public StockNotFoundException(String stock_not_found) {
        super(stock_not_found);
    }
}
