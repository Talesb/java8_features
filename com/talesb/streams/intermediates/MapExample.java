package com.talesb.streams.intermediates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Doe", "Alice");

        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());

        System.out.println(nameLengths);


    }
}
