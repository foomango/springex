package com.foomango;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("Bean.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloworld");

        obj.getMessage();
        
    }
}
