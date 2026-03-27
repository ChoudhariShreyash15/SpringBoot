package com.springSecurity.Mar04_2026_SpringSecurity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user1_seq")
    @SequenceGenerator(name = "user1_seq", sequenceName = "user1_seq", allocationSize = 1)
    private Long id;

    private String username;

    private String password;

    private String role;
}