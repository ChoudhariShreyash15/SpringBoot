package com.example.UpdateData.repo;

import com.example.UpdateData.entity.Employees;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("QUERYSERVICE")
public interface Feign {

    @GetMapping("/student/get/{id}")
    public Employees getById(@PathVariable int id);

    @GetMapping("/student/getAll")
    public List<Employees> getAll();
}
