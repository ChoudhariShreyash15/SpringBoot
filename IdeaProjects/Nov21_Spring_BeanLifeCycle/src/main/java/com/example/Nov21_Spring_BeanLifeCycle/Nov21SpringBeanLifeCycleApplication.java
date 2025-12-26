package com.example.Nov21_Spring_BeanLifeCycle;

import com.example.Nov21_Spring_BeanLifeCycle.BeanLifeCycle.component.BeanLifeCycle;
import com.example.Nov21_Spring_BeanLifeCycle.BeanLifeCycle.configuration.AppConfig;
import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Annotation.component.Car;
import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Annotation.configuration.Config;
import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.component.Vehicle;
import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.Java.configuration.JavaConfig;
import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.XML.component.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Nov21SpringBeanLifeCycleApplication {

	public static void main(String[] args) {
//		//XML Based
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
//		Principal bean = applicationContext.getBean(Principal.class);
//		bean.name();

//		Java Based
//		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Vehicle bean1 = applicationContext1.getBean(Vehicle.class);
//		bean1.engineType();

		//Annlotation Based
//		ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(Config.class);
//		Car bean2 = applicationContext2.getBean(Car.class);
//		bean2.carType();

		//Bean Life Cycle
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.close(); // Trigger destroy lifecycle

	}
}
