package com.practiceapp.employeems;

import com.practiceapp.employeems.frontend.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        //ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MainApp.class);
        ApplicationContext context = SpringApplication.run(MainApp.class,args);
        Frontend frontend = context.getBean(Frontend.class);
        frontend.runUi();
    }
}
