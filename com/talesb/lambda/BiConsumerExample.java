package com.talesb.lambda;

import java.util.function.BiConsumer;

public class BiConsumerExample {


    public static void main(String[] args) {

        BiConsumer<String, String> concatAndPrint = (s1, s2) -> {
            System.out.println(s1.concat(s2));
        };

        concatAndPrint.accept("Here is an example of ", "BiConsumer Functional Interface");

    }


}
