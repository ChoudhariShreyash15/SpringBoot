package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Annotation.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Annotation.repo.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    Vehicle vehicle;

    public void carType() {
        System.out.println(vehicle.carType());
//        System.out.println(vehicle.car());
    }

//    public static void main(String[] args) {
//        Vehicle.car1();
//
//    }
}
