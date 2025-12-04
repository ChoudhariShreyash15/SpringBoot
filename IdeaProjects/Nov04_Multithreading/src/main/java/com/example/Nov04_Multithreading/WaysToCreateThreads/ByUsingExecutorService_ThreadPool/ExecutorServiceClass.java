package com.example.Nov04_Multithreading.WaysToCreateThreads.ByUsingExecutorService_ThreadPool;//package com.example.Nov04_Multithreading.WaysToCreateThreads.ByUsingExecutorService_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i=1; i<=5; i++) {
            int taskId = i;
            service.submit(() -> {
                System.out.println("Running Task " + taskId + " on " + Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}