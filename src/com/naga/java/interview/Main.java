package com.naga.java.interview;

import com.naga.java.interview.multithreading.CustomThread;

public class Main {
    public static void main(String[] args) {
        // creatig cuastom thread using Thread class
        CustomThread customThread = new CustomThread();
        customThread.start();

        // Creating custom thread using runnable interface
        // CustomRunnable customRunnable = new CustomRunnable();
        // Thread customRunnableThread = new Thread(customRunnable);
        // customRunnableThread.start();

        for (int i = 21; i < 40; i++) {
            System.out.println("main thread " + i);
        }
    }
}
