package com.example.UpdateData.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    @Id
    @SequenceGenerator(name = "studentSeq", initialValue = 1, allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentSeq")
    private Integer id;
    private String name;
    private double salary;
    private String dept;
    private String status;
}
