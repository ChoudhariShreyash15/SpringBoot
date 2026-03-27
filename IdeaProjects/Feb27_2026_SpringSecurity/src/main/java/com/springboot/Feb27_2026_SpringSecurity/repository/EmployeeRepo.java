package com.springboot.Feb27_2026_SpringSecurity.repository;

import com.springboot.Feb27_2026_SpringSecurity.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
