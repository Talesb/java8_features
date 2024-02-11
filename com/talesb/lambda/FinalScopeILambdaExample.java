package com.talesb.lambda;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FinalScopeILambdaExample {


    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());

        AtomicInteger sum = new AtomicInteger(0); // Mutable wrapper for int

        numbers.forEach(num -> {
            // Incrementing sum inside lambda expression
            sum.addAndGet(num);
        });

        System.out.println("Sum: " + sum.get()); // Accessing updated sum value
    }


}
