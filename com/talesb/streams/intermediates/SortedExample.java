package com.talesb.streams.intermediates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 2, 5);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);
    }
}
