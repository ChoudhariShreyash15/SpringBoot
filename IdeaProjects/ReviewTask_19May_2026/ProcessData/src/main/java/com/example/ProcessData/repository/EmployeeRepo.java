package com.example.ProcessData.repository;

import com.example.ProcessData.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employees, Integer> {

    @Query("SELECT e FROM Employees e WHERE e.status <> 'COMPLETED'")
    List<Employees> findAllByStatusNotCompleted();
}