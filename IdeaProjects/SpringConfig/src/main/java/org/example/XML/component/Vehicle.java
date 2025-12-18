package org.example.XML.component;

import org.example.XML.repo.XMLConfig;

public class Vehicle {
    private XMLConfig xmlConfig;

    public Vehicle() {
        this.xmlConfig = xmlConfig;
    }

//        public void setXmlConfig(XMLConfig xmlConfig) {
//        this.xmlConfig = xmlConfig;
//    }

    public void vehicleType() {
        System.out.println(xmlConfig.name());
    }
}
