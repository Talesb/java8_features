package com.talesb.lambda;


public class Main {

    public static void main(String[] args) {


        //Before java8
        SampleFunctionalInterface sample = new SampleFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("Method called.");
            }
        };


        sample.method();


        SampleFunctionalInterface sampleLambda = () -> {
            System.out.println("Method called with lambda.");
        };

        SampleFunctionalInterface sampleLambda2 = () -> System.out.println("Method called with lambda 2.");

        sampleLambda.method();
        sampleLambda2.method();


        //Before java8
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread executed");
            }
        }).start();

        //With lambda Java 8
        new Thread(() -> System.out.println("Thread executed")).start();


    }
}
