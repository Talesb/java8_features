package com.talesb.streams.terminaloperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 2, 5);

        Optional<Integer> min = numbers.stream()
                .min(Comparator.naturalOrder());

        Optional<Integer> max = numbers.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Min: " + min.get());

        System.out.println("Max: " + max.get());
    }



}
