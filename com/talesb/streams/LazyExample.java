package com.talesb.streams;

import java.util.stream.Stream;

public class LazyExample {

    public static void main(String[] args) {

        Stream.of("one", "two", "three", "four", "five", "six")
                .filter(e -> {
                    System.out.println("Filter was called for: " + e);
                    return e.length() > 3;
                })
                .forEach(e -> System.out.println("forEach was called for: " + e));

    }
}
