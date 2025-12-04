package com.example.Nov21_Spring_BeanLifeCycle.BeanLifeCycle.configuration;

import com.example.Nov21_Spring_BeanLifeCycle.BeanLifeCycle.component.BeanLifeCycle;
import com.example.Nov21_Spring_BeanLifeCycle.BeanLifeCycle.component.CustomBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
//    public CustomBean getCustomBean() {
//        return new CustomBean();
//    }

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public BeanLifeCycle beanLifeCycle() {
        return new BeanLifeCycle();
    }
}
