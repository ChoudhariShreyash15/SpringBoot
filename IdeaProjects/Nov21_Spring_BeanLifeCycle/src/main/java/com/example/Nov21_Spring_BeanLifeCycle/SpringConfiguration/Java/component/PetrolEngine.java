package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.repo.Engine;

public class PetrolEngine implements Engine {
    @Override
    public void engineType() {
        System.out.println("Petrol Engine");
    }
}
