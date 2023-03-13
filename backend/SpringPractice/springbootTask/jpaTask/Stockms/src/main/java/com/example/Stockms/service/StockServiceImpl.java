package com.example.Stockms.service;

import com.example.Stockms.dao.IStockDao;
import com.example.Stockms.entity.Stock;
import com.example.Stockms.exception.InvalidIdException;
import com.example.Stockms.exception.InvalidNameException;
import com.example.Stockms.exception.InvalidUnitsException;
import com.example.Stockms.exception.StockNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;
@Transactional
@Service
public class StockServiceImpl implements IStockService{
    @Autowired
    IStockDao stockDao;
    @Override
    public Stock register(String name, int units) {
        validateName(name);
        validateUnits(units);
        Stock stock = new Stock(name, units);
        Stock returnedStock = stockDao.save(stock);
        return returnedStock;
    }

    @Override
    public Stock findStockById(long id) throws StockNotFoundException {
        validateID(id);
        Stock stock = stockDao.findById(id);
        if(stock ==  null){
            throw new StockNotFoundException("Stock not found");
        }
        return stock;
    }

    @Override
    public void changeName(long id, String changedName) throws StockNotFoundException {
        validateID(id);
        validateName(changedName);
        Stock stock = findStockById(id);
        stock.setName(changedName);
        Stock updatedStock = stockDao.save(stock);
    }

    @Override
    public List<Stock> findByName(String name) throws StockNotFoundException{
        validateName(name);
        List<Stock> foundByName = stockDao.findByName(name);
        if(foundByName==null || foundByName.size()==0){
            throw  new StockNotFoundException("Stock not found for the given name "+ name );
        }
        return foundByName;
    }

    @Override
    public List<Stock> findAll()throws StockNotFoundException {
        List<Stock> foundAll=stockDao.findAll();
        if(foundAll==null || foundAll.size()==0){
            throw  new StockNotFoundException("Stock not found in the database ");
        }
        return foundAll;
    }

    private void validateName(String name){
        if(name.length()<2 || name.length()>10){
            throw new InvalidNameException("Name is invalid");
        }
    }
    private void validateUnits(int units){
        if(units<0){
            throw new InvalidUnitsException("Units is invalid");
        }
    }
    private void validateID(long id){
        if(id<=0){
            throw new InvalidIdException("ID is invalid");
        }
    }
}