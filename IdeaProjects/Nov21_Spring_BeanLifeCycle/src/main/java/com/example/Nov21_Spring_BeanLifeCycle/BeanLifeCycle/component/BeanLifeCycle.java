package com.example.Nov21_Spring_BeanLifeCycle.BeanLifeCycle.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    public BeanLifeCycle() {
        System.out.println("1. Constructor: Bean object created");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("3. InitializingBean: afterPropertiesSet called");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct: Bean initialized");
    }

    @Override
    public void destroy() {
        System.out.println("6. DisposableBean: destroy called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("5. @PreDestroy: cleanup called");
    }
}
