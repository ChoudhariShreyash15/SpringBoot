package org.example.Java.component;

import org.example.XML.repo.XMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle1 {
    private XMLConfig xmlConfig;

//    public Vehicle(XMLConfig xmlConfig) {
//        this.xmlConfig = xmlConfig;
//    }

    @Autowired
    @Qualifier("tw")
    public void setXmlConfig(XMLConfig xmlConfig) {
        this.xmlConfig = xmlConfig;
    }

    public void vehicleType() {
        System.out.println(xmlConfig.name());
    }
}
