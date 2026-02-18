package com.example.Jan05_MultipleDBConn.oracleEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @SequenceGenerator(name = "sequence",initialValue = 1, allocationSize = 20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private Integer id;
    private String name;
}
