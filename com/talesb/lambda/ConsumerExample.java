package com.talesb.lambda;

import java.util.function.Consumer;

//Use the parameter but not interested in the return value
public class ConsumerExample {


    public static void main(String[] args) {

        Consumer<String> print = (s) -> {
            System.out.println(s);
        };

        print.accept("Here is an example of Consumer Functional Interface");

    }







}
