package com.talesb.streams.terminaloperation;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 10, 10);
        Integer result = list.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);
    }


}
