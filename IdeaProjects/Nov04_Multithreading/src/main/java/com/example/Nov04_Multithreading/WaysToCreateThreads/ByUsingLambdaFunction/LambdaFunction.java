package com.example.Nov04_Multithreading.WaysToCreateThreads.ByUsingLambdaFunction;

public class LambdaFunction {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            System.out.println("Thread running using Lambda function: " + Thread.currentThread().getName());
        });
        thread.start();

    }
}
