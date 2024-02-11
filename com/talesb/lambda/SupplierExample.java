package com.talesb.lambda;

import java.util.function.Supplier;

//When you want to return some value without any input
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Double> randomSuplier = () -> {
            return Math.random();
        };

        System.out.println(randomSuplier.get());



    }
}
