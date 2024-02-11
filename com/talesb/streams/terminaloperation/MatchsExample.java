package com.talesb.streams.terminaloperation;
import java.util.*;
public class MatchsExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean anyGreaterThan3 = numbers.stream()
                .anyMatch(number -> number > 3);

        boolean allLessThan10 = numbers.stream()
                .allMatch(number -> number < 10);

        boolean noneGreaterThan100 = numbers.stream()
                .noneMatch(number -> number > 100);

        System.out.println("Any greater than 3: " + anyGreaterThan3);
        System.out.println("All less than 10: " + allLessThan10);
        System.out.println("None greater than 100: " + noneGreaterThan100);

    }
}
