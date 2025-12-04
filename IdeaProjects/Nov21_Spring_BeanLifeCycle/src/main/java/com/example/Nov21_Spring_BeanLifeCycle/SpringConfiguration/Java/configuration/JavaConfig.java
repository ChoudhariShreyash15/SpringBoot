package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.configuration;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.component.DieselEngine;
import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.component.PetrolEngine;
import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.component.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "diesel")
    public DieselEngine getDiesel(){
        return new DieselEngine();
    }

    @Bean(name = "petrol")
    public PetrolEngine getPetrol(){
        return new PetrolEngine();
    }

    @Bean
    public Vehicle getVehicle(){
        return new Vehicle();
    }
}
