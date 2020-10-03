package com.navin.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@ComponentScan(basePackages = "com.navin.telusko")
public class Car implements  Vehicle{

    @Autowired
    Tyre t;

    public Car() {

    }

    public void drive()
    {
        System.out.println("chal raha hai....");
    t.setBrand("MRF");
        System.out.println(t.getBrand());
    }
}
