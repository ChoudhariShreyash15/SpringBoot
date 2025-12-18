package org.example.Java.configuration;

import org.example.Java.component.FourWheeler1;
import org.example.Java.component.TwoWheeler1;
import org.example.Java.component.Vehicle1;
import org.example.XML.component.TwoWheeler;
import org.example.XML.component.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "fw")
    public FourWheeler1 getFourWheeler1() {
        return new FourWheeler1();
    }

    @Bean(name = "tw")
    public TwoWheeler1 getTwoWheeler1() {
        return new TwoWheeler1();
    }

    @Bean
    public Vehicle1 getVehicle() {
        return new Vehicle1();
    }

}
