package com.example.Task_23Apr_2026.service;

import com.example.Task_23Apr_2026.dto.RequestDto;
import com.example.Task_23Apr_2026.dto.ResponseDto;
import com.example.Task_23Apr_2026.entity.MyEntity;
import com.example.Task_23Apr_2026.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    private MyRepository repository;

    @Autowired
    private AsyncUpdateService asyncUpdateService;

    public ResponseDto saveAndTrigger(RequestDto request) {

        if (request.getName() == null || request.getName().isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        // Step 1: Save
        MyEntity entity = new MyEntity();
        entity.setName(request.getName());
        MyEntity saved = repository.save(entity);

        Long id = saved.getId();

        // Step 2: Async update
        asyncUpdateService.runUpdate(id);

        // Step 3: Return response
        return new ResponseDto("Saved successfully", id);
    }
}