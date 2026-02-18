package com.example.Jan05_MultipleDBConn.controller;

import com.example.Jan05_MultipleDBConn.oracleEntity.Student;
import com.example.Jan05_MultipleDBConn.service.SchoolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class SchoolController {
    final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return schoolService.getStudentById(id);
    }

    @GetMapping("/id")
    public List<Student> getAllStudents(@RequestParam Integer id){
        return schoolService.getAllStudent();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return schoolService.addStudent(student);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return schoolService.updateStudent(student);
    }

    @DeleteMapping("/delete")
    public void deleteStudent(@RequestParam Integer id){
        schoolService.deleteStudent(id);
    }
}
