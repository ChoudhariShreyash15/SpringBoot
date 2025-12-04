package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Annotation.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Annotation.repo.Vehicle;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sedan implements Vehicle {
    @Override
    public String carType() {
        return "You are using a Sedan Car";
    }
}
