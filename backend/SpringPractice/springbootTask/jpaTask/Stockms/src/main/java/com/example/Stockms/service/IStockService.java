package com.example.Stockms.service;

import com.example.Stockms.entity.Stock;
import com.example.Stockms.exception.StockNotFoundException;

import java.util.List;

public interface IStockService {
    Stock register(String name,int units);
    Stock findStockById(long id) throws StockNotFoundException;
    void changeName(long id,String changedName) throws StockNotFoundException;
    List<Stock> findByName(String name) throws StockNotFoundException;
    List<Stock> findAll() throws StockNotFoundException;

}
