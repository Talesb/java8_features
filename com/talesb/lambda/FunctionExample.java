package com.talesb.lambda;

import java.util.function.Function;


//Transform the input into some output(types may be different)
public class FunctionExample {

    public static void main(String[] args) {


        Function<Integer,String> convert = (i) -> {
            return Integer.toString(i);
        };

        System.out.println(convert.apply(3));


        Function<String,Integer> getLength = (s) -> {
            return s.length();
        };

        System.out.println(getLength.apply("Hello"));

    }



}
