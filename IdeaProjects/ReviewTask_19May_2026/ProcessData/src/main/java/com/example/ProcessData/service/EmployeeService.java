package com.example.ProcessData.service;

import com.example.ProcessData.entity.Employees;
import com.example.ProcessData.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employees getById(int id){
        return employeeRepo.findById(id).orElseThrow(()-> new RuntimeException("Employee Not Found"));
    }

    public List<Employees> getAll(){
        return employeeRepo.findAll();
    }

    public List<Employees> findAllByStatusNotCompleted() {
        return employeeRepo.findAllByStatusNotCompleted();
    }
}
