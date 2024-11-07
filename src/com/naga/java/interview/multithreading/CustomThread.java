package com.naga.java.interview.multithreading;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("new thread created!!!!! using thread class No-parm!!!!");

        for (int i = 0; i < 20; i++) {
            System.out.println("custom thread " + i);
        }
    }
    public void run(String s) {
        System.out.println(s);
        System.out.println("new thread created!!!!! using thread class param!!!");
    }

}
