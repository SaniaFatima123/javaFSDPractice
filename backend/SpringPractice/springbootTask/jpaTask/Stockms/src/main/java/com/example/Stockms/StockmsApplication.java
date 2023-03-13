package com.example.Stockms;

import com.example.Stockms.frontend.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StockmsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(StockmsApplication.class, args);
		Frontend frontend = applicationContext.getBean(Frontend.class);
		frontend.runUI();
	}

}
