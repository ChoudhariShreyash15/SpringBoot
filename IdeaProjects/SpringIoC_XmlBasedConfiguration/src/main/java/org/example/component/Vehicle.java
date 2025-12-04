package org.example.component;

import org.example.repo.Engine;
import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void info(){
        engine.engineType();
    }
}
