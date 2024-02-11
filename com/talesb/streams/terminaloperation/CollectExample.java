package com.talesb.streams.terminaloperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        List<String> collection = list.stream()
                .collect(Collectors.toList());


        System.out.println(collection);
    }





}
