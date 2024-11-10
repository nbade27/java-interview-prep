package com.naga.java.interview.multithreading;

public class CustomThread extends Thread {
    CustomThread() {

    }

    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // you can get current running thread name at any point of time. like below
        // System.out.println(Thread.currentThread().getName());
        
        System.out.println("new thread created " + getName() + "!!!!! using thread class param!!!");

        for (int i = 0; i < 20; i++) {
            System.out.println("custom thread " + i);
        }
    }

    public void run(String s) {
        System.out.println(s);
        System.out.println("new thread created " + getName() + "!!!!! using thread class param!!!");
    }

}
