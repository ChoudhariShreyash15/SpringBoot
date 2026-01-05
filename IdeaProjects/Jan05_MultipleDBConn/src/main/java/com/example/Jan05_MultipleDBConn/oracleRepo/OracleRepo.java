package com.example.Jan05_MultipleDBConn.oracleRepo;

import com.example.Jan05_MultipleDBConn.oracleEntity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleRepo extends JpaRepository<Student, Integer> {
}
