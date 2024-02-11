package com.talesb.streams.terminaloperation;

import java.util.Arrays;
import java.util.List;

public class CountExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        long count = list.stream()
                .count();

        System.out.println(count);
    }
}
