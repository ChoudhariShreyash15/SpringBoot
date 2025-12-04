package org.example;

import org.example.component.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.info();
    }
}
