package com.springSecurity.Mar04_2026_SpringSecurity.service;

import com.springSecurity.Mar04_2026_SpringSecurity.dto.LoginRequest;
import com.springSecurity.Mar04_2026_SpringSecurity.dto.RegisterRequest;
import com.springSecurity.Mar04_2026_SpringSecurity.entity.AppUser;
import com.springSecurity.Mar04_2026_SpringSecurity.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    //Register User
    public String registerUser(RegisterRequest registerRequest) {
        AppUser user = new AppUser();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setRole(registerRequest.getRole());

        AppUser save = userRepository.save(user);
        if (save != null)
            return "Register Successfully";

        return "Registration fail";
    }

    //Login User
    public String loginUser(LoginRequest loginRequest) {
        AppUser byUsername = userRepository.findByUsername(loginRequest.getUsername());

        if (byUsername == null) {
            return "not found";
        } else {
            try {
                boolean authenticated = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())).isAuthenticated();
                return "success";
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
