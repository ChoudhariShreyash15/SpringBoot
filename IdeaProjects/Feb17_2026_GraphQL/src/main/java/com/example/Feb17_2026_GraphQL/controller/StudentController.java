package com.example.Feb17_2026_GraphQL.controller;

import com.example.Feb17_2026_GraphQL.entity.Student;
import com.example.Feb17_2026_GraphQL.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

//    public StudentController(StudentService service) {
//        this.service = service;
//    }

    @QueryMapping
    public Student getStudent(@Argument Long id) {
        return service.getStudent(id);
    }

    @QueryMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @MutationMapping
    public Student addStudent(
            @Argument String name,
            @Argument Integer marks) {

        return service.addStudent(name, marks);
    }

    @MutationMapping
    public String deleteStudent(@Argument Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}
