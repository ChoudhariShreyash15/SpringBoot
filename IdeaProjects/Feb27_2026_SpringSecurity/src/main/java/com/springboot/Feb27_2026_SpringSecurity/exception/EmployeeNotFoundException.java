package com.springboot.Feb27_2026_SpringSecurity.exception;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
