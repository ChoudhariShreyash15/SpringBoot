package com.springSecurity.Mar04_2026_SpringSecurity.repo;

import com.springSecurity.Mar04_2026_SpringSecurity.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}