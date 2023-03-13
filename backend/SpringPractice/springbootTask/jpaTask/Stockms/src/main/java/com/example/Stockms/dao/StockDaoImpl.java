package com.example.Stockms.dao;

import com.example.Stockms.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class StockDaoImpl implements  IStockDao{
    //@Autowired
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Stock save(Stock stock) {
        entityManager.merge(stock);
        return stock;
    }

    @Override
    public Stock findById(long id) {
        Stock stock = entityManager.find(Stock.class,id);
        return stock;
    }

    @Override
    public List<Stock> findByName(String name) {
        String query = "from Stock where name =: nameArg";
        TypedQuery<Stock> typedQuery = entityManager.createQuery(query,Stock.class);
        typedQuery.setParameter("nameArg",name);
        List<Stock> stocks = typedQuery.getResultList();
        return stocks;
    }

    @Override
    public List<Stock> findAll() {
        String query = "from Stock";
        TypedQuery<Stock> typedQuery = entityManager.createQuery(query,Stock.class);
        List<Stock> stocks = typedQuery.getResultList();
        return stocks;
    }
}
