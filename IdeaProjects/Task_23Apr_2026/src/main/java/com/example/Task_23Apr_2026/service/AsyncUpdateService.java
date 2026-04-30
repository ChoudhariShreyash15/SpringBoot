package com.example.Task_23Apr_2026.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncUpdateService {

    @Async("asyncExecutor")
    public void runUpdate(Long id) {
        try {
            System.out.println("Async update started for ID: " + id);

            // simulate long task (20 min)
            Thread.sleep(20000); // reduce for testing

            System.out.println("Async update completed for ID: " + id);

        } catch (Exception e) {
            System.err.println("Error in async update for ID: " + id);
            e.printStackTrace();
        }
    }
}