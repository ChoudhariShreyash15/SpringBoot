package com.example.Nov04_Multithreading.WaysToCreateThreads.ByExtendingThreadClass;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread running using Thread class: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
