package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.repo.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {

    private Engine engine;

    @Autowired
    @Qualifier("petrol")
    public void setEngine(Engine engine) {
        this.engine=engine;
    }

    public void engineType() {
        engine.engineType();
    }
}
