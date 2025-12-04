package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.repo.Engine;

public class DieselEngine implements Engine {
    @Override
    public void engineType() {
        System.out.println("Diesel Engine");
    }
}
