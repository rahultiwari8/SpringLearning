package com.navin.telusko;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.navin.telusko")
public class AutoConfiguration {


    @Bean
    public Car getCar()
    {
        Car c= new Car();
        return c;
       
    }

}
