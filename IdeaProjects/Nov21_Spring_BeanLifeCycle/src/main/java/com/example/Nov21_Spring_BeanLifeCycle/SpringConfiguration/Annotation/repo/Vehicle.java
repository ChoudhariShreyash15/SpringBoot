package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Annotation.repo;

@FunctionalInterface
public interface Vehicle {
    abstract String carType();

    default String car(){
        return "default call hote";
    }
    static void car1(){}
}
