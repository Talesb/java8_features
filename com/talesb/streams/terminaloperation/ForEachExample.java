package com.talesb.streams.terminaloperation;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d");

        list.stream()
                .forEach(element -> System.out.println(element));


    }
}
