package com.springboot.Feb27_2026_SpringSecurity.controller;

import com.springboot.Feb27_2026_SpringSecurity.entity.Eidiko;
import com.springboot.Feb27_2026_SpringSecurity.response.ResponseHandler;
import com.springboot.Feb27_2026_SpringSecurity.service.EidikoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eidiko")
public class EidikoController {

    @Autowired
    private EidikoService eidikoService;

    //Read or Select or GET or Retrieve
    @GetMapping("/get/{id}")
    public Eidiko getEmployee(@PathVariable int id){
        return eidikoService.getEmployee(id);
    }

    //Create or add or POST
    @PostMapping("/add")
    public ResponseEntity<ResponseHandler> addEmployee(@RequestBody Eidiko eidiko){
        eidikoService.addEmployee(eidiko);
        ResponseHandler responseHandler = new ResponseHandler("Data Added" , HttpStatus.CREATED, eidiko);
        return new ResponseEntity<>(responseHandler , HttpStatus.CREATED);
    }


    @PostMapping("/object")
    public Eidiko addObject(@RequestBody String eidiko) throws JsonProcessingException {
        ObjectMapper objectMapper= new ObjectMapper();
        return objectMapper.readValue(eidiko,Eidiko.class);
    }
}

