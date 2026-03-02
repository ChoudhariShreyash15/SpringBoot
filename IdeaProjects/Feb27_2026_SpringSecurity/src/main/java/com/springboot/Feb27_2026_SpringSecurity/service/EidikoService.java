package com.springboot.Feb27_2026_SpringSecurity.service;

import com.springboot.Feb27_2026_SpringSecurity.entity.Eidiko;
import com.springboot.Feb27_2026_SpringSecurity.exception.EmployeeNotFoundException;
import com.springboot.Feb27_2026_SpringSecurity.repository.EidikoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EidikoService {

    @Autowired
    private EidikoRepo eidikoRepo;

//    public EidikoService(EidikoRepo eidikoRepo){
//        this.eidikoRepo=eidikoRepo;
//    }

    //GET or Read
    public Eidiko getEmployee(int empId){
        Eidiko eidiko;
//        eidiko = eidikoRepo.findById(empId).orElseThrow(()-> {
//            throw new RuntimeException("Employee Not Found");
//        });
        try{
            eidiko = eidikoRepo.findById(empId).orElseThrow(()->{
                throw new EmployeeNotFoundException("Employee Not Found");
            });
        }
        catch (EmployeeNotFoundException e){
            throw e;
        }
        return eidiko;
    }

    //POST or Create
    public Eidiko addEmployee(Eidiko eidiko){
        return eidikoRepo.save(eidiko);
    }
}
