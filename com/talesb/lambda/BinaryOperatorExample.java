package com.talesb.lambda;

import java.util.function.BinaryOperator;


//All types must be the same
public class BinaryOperatorExample {


    public static void main(String[] args) {

        BinaryOperator <Integer> add = (a, b) -> {
            return a + b;
        };


        System.out.println(add.apply(5, 3));


    }


}
