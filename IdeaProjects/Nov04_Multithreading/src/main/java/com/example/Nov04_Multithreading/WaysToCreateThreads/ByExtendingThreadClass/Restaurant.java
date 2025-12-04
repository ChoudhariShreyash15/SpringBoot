package com.example.Nov04_Multithreading.WaysToCreateThreads.ByExtendingThreadClass;

class CookingTask extends Thread {
    private String task;

    CookingTask(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being prepared by " +
                Thread.currentThread().getName());
    }
}

public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new CookingTask("Pasta");
        Thread t2 = new CookingTask("Salad");
        Thread t3 = new CookingTask("Dessert");
        Thread t4 = new CookingTask("Rice");

        t1.start();
//        Thread.sleep(2000);
        t2.start();
//        Thread.sleep(2000);
        t3.start();
//        Thread.sleep(2000);
        t4.start();
//        Thread.sleep(2000);
    }
}