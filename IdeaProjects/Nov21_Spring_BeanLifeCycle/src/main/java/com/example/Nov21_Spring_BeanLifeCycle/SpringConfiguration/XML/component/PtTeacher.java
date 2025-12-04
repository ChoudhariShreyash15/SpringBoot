package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.XML.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.XML.repo.School;

public class PtTeacher implements School {
    @Override
    public String teacher() {
        return "Pankaj Udaas";
    }
}
