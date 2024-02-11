package com.talesb.lambda;


import java.util.function.BiPredicate;

//When you want to filter/match some condition using two parameters
public class BiPredicateExample {


    public static void main(String[] args) {
        BiPredicate<String, Integer> checkLength = (s, i) -> {
            return s.length() == i;
        };

        System.out.println(checkLength.test("Hello", 5)); //True
        System.out.println(checkLength.test("test", 2)); //False

    }



}
