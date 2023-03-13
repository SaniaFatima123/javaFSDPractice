package com.practiceapps.employeems;

import com.practiceapps.employeems.frontend.Frontend;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainapp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(JavaConfig.class);
        Frontend frontend = applicationContext.getBean(Frontend.class);
        frontend.runUI();
    }
}
