package com.example.Nov21_Spring_BeanLifeCycle.BeanLifeCycle.component;

public class CustomBean {

    public void customInit() {
        System.out.println("4. Custom Init Method: customInit()");
    }

    public void customDestroy() {
        System.out.println("7. Custom Destroy Method: customDestroy()");
    }
}
