package com.talesb.lambda;

import java.util.function.BiFunction;

public class BiFunctionExample {


    public static void main(String[] args) {

        BiFunction <Integer, Integer, Integer> add = (a, b) -> {
            return a + b;
        };

        BiFunction<String,String,Integer> getTotalLength = (s1,s2) -> {
            return s1.length() + s2.length();
        };


        System.out.println(add.apply(3, 4));

        System.out.println(getTotalLength.apply("Hello", "World"));



    }



}
