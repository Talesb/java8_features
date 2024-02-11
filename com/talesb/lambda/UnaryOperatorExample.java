package com.talesb.lambda;

import java.util.function.UnaryOperator;


//Transform the input into some output(types needs to be the same)
public class UnaryOperatorExample {

    public static void main(String[] args) {


        UnaryOperator <Integer> addTen = (a) -> {
            return a + 10;
        };

        System.out.println(addTen.apply(3));

    }




}
