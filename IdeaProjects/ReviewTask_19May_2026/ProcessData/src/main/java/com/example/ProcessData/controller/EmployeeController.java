package com.example.ProcessData.controller;

import com.example.ProcessData.entity.Employees;
import com.example.ProcessData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get/{id}")
    public Employees getById(@PathVariable int id){
        return employeeService.getById(id);
    }

    @GetMapping("/getAll")
    public List<Employees> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/getAllByStatusNotCompleted")
    public List<Employees> getAllByStatusNotCompleted(){
        return employeeService.findAllByStatusNotCompleted();
    }
}
