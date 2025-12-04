package com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.XML.component;

import com.example.Nov21_Spring_BeanLifeCycle.SpringConfiguration.XML.repo.School;
import org.springframework.beans.factory.annotation.Autowired;

public class Principal {
    private School school;

    public void setSchool(School school) {
        this.school=school;
    }

    public void name() {
        school.teacher();
        if (school.teacher().equals("Priyanka")) {
            System.out.println("Hi " + school.teacher() + ".Nice to meet you!");
        }
        else {
            System.out.println("Chal Nikal bsdk");
        }
    }
}
