package com.example.Stockms.frontend;

import com.example.Stockms.entity.Stock;
import com.example.Stockms.exception.InvalidIdException;
import com.example.Stockms.exception.InvalidNameException;
import com.example.Stockms.exception.InvalidUnitsException;
import com.example.Stockms.exception.StockNotFoundException;
import com.example.Stockms.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class Frontend {
    @Autowired
    IStockService stockService;
    public void runUI(){
        Stock stock1 = stockService.register("ITC",220);
        System.out.println(stock1 + " Added");
        Stock stock2 = stockService.register("NIFT",500);
        System.out.println(stock2 + " Added");
        Stock stock3 = stockService.register("ITC",300);
        System.out.println(stock3 + " Added");


        try {
            System.out.println("*************************************");
            System.out.println("Finding stock by id******************");
            Stock foundById = stockService.findStockById(2);
            display(foundById);

            System.out.println("*************************************");
            System.out.println("Finding stock by name******************");
            List<Stock> foundNameList = stockService.findByName("ITC");
            display(foundNameList);

            System.out.println("*************************************");
            System.out.println("Finding All Stocks******************");
            List<Stock> foundAllStocks = stockService.findAll();
            display(foundAllStocks);

            System.out.println("*************************************");
            System.out.println("Updating name ***********************");
            stockService.changeName(2,"WIPRO");

            System.out.println("*************************************");
            System.out.println("Finding All Stocks after Updating ***");
            List<Stock> foundAllStocksAfterUpdate = stockService.findAll();
            display(foundAllStocksAfterUpdate);



        }
        catch(InvalidNameException | InvalidIdException | InvalidUnitsException | StockNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    void display(Stock stock){
        System.out.println("Id is "+stock.getId()+" Name is "+stock.getName()+" Units is "+stock.getUnits());
    }
    void display(Collection<Stock> stocks){
        for(Stock stock: stocks){
           display(stock);
        }
    }
}
