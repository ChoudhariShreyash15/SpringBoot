package com.example.Jan05_MultipleDBConn.service;

import com.example.Jan05_MultipleDBConn.oracleEntity.Student;
import com.example.Jan05_MultipleDBConn.oracleRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {

    @Autowired
    private StudentRepo studentRepo;

    public Optional<Student> getStudentById(Integer id){
        return studentRepo.findById(id);
    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public void deleteStudent(Integer id){
        studentRepo.deleteById(id);
    }
}
