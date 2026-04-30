package com.example.Task_23Apr_2026.repo;

import com.example.Task_23Apr_2026.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<MyEntity, Long> {
}