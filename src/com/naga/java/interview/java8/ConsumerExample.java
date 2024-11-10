package com.naga.java.interview.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class ConsumerImpl implements Consumer {

    @Override
    public void accept(Object t) {
        System.out.println(t);
    }

}

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        // implementing consumer with custom implementation method
        // ConsumerImpl consImpl = new ConsumerImpl();
        // list.forEach(consImpl);

        // implementing consumer with lambda expression
        list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList()).forEach(a -> System.out.println(a));
    }
}
