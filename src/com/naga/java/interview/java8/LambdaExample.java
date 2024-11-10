package com.naga.java.interview.java8;

interface A {
    void show(int a);
}

// class Lambda implements A {

// @Override
// public void show() {
// System.out.println("Hello!!");
// }

// }

public class LambdaExample {
    public static void main(String[] args) {

        // A l = new A() {

        // @Override
        // public void show() {
        // System.out.println("Hello!!");
        // }
        // };
        // l.show();

        // we can replicate above code in lambda expression
        A l = (a) -> System.out.println("Hello! " + a);
        l.show(7);

    }
}
