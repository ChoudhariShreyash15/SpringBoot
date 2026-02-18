package com.example.Feb17_2026_GraphQL.repository;

import com.example.Feb17_2026_GraphQL.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
