package com.navin.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClaa {

    public static void main(String[] args) {



       ApplicationContext applicationContext =new AnnotationConfigApplicationContext(AutoConfiguration.class);
        //Car c = new Car();
       // Bike b =new Bike();
       // b.drive();
       Car c= applicationContext.getBean(Car.class);
       c.drive();
       
       System.out.println("changes by eclipse again ");
       System.out.println("changes by eclipse again :)");
    }
}
