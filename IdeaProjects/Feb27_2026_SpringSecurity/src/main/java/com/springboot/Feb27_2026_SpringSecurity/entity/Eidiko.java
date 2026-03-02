package com.springboot.Feb27_2026_SpringSecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eidiko {

    @Id
    private int empId;
    private String empName;
    private String dept;
    private double empSalary;
}
