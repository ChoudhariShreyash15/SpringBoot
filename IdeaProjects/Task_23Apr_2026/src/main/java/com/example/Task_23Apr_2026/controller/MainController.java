package com.example.Task_23Apr_2026.controller;

import com.example.Task_23Apr_2026.dto.RequestDto;
import com.example.Task_23Apr_2026.dto.ResponseDto;
import com.example.Task_23Apr_2026.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private MainService mainService;

    @PostMapping("/save")
    public ResponseEntity<ResponseDto> save(@RequestBody RequestDto request) {

        ResponseDto response = mainService.saveAndTrigger(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}