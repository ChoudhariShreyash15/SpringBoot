package com.springboot.Feb27_2026_SpringSecurity.repository;

import com.springboot.Feb27_2026_SpringSecurity.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepo extends JpaRepository<Roles, Integer> {
    Roles findByName(String role);
}
