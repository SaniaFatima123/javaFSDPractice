package com.example.Stockms.dao;

import com.example.Stockms.entity.Stock;

import java.util.List;

public interface IStockDao {
    Stock save(Stock stock);
    Stock findById(long id);
    List<Stock> findByName(String name);
    List<Stock> findAll();
}
