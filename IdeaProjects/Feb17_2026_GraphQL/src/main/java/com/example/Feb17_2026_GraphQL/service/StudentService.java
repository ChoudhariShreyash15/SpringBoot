package com.example.Feb17_2026_GraphQL.service;

import com.example.Feb17_2026_GraphQL.entity.Student;
import com.example.Feb17_2026_GraphQL.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student getStudent(Long id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found"));
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student addStudent(String name, Integer marks) {
        Student student = new Student(null, name, marks);
        return repo.save(student);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}
