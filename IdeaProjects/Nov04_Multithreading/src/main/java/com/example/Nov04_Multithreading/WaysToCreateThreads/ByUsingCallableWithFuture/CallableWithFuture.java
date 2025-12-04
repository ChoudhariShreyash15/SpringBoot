package com.example.Nov04_Multithreading.WaysToCreateThreads.ByUsingCallableWithFuture;

import java.util.concurrent.*;

public class CallableWithFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            return "Task Completed By " + Thread.currentThread().getName();
        };

        Future<String> result = executorService.submit(task);

        System.out.println("Result: " + result.get());
        executorService.shutdown();
    }
}
