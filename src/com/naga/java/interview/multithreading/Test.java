package com.naga.java.interview.multithreading;

public class Test {
    public static void main(String[] args) {
        // creatig cuastom thread using Thread class
        CustomThread accThread = new CustomThread("Accounts Thread");
        CustomThread contThread = new CustomThread("Contacts Thread");
        // accThread.setPriority(10);
        // contThread.setPriority(1);
        // accThread.setDaemon(true);
        // accThread.start();
        contThread.start();
        Thread.yield();
        System.out.println("main end!");

        // System.out.println("thread group name : " + accThread.getThreadGroup());
        // System.out.println("thread group name : " + contThread.getThreadGroup());
        // System.out.println( contThread);

        // Creating custom thread using runnable interface
        // CustomRunnable customRunnable = new CustomRunnable();
        // Thread customRunnableThread = new Thread(customRunnable);
        // customRunnableThread.start();

        // for (int i = 21; i < 40; i++) {
        // System.out.println("main thread " + i);
        // }

    }
}
