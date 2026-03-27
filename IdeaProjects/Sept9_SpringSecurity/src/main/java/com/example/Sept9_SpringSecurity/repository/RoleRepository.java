package com.example.Sept9_SpringSecurity.repository;

import com.example.Sept9_SpringSecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {

    Role findByName(String name);
}
