package org.example;

import org.example.Java.component.Vehicle1;
import org.example.Java.configuration.Config;
import org.example.XML.component.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //XML
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
//        Vehicle bean = (Vehicle) applicationContext.getBean("v");
//        bean.vehicleType();

        //Java
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Config.class);
        Vehicle1 bean = applicationContext.getBean(Vehicle1.class);
        bean.vehicleType();
    }
}
