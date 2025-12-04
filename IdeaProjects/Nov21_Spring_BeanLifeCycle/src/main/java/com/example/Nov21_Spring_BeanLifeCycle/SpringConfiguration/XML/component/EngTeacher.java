package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.XML.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.XML.repo.School;

public class EngTeacher implements School {
    @Override
    public String teacher() {
        return "Priyanka";
    }
}
