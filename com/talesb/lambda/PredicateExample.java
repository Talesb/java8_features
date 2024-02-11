package com.talesb.lambda;

import java.util.function.Predicate;


//When you want to filter/match some condition
public class PredicateExample {


    public static void main(String[] args) {
        //True
        System.out.println(verify(10, (x) -> {
            return x > 5;
        }));
        //False
        System.out.println(verify(3, (x) -> {
            return x > 5;
        }));


    }


    public static <T> boolean verify(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }
}
