package com.example.Nov04_Multithreading.WaysToCreateThreads.ByImplementingRunnableInterface;

import org.yaml.snakeyaml.error.MarkedYAMLException;

public class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Thread running using Runnable interface: " + Thread.currentThread().getName());
    }
}

class Threads {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread thread = new Thread(r);
        thread.start();
//        Thread thread1 = new Thread(r);
//        thread1.start();
    }
}