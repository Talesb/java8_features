package com.talesb.streams;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Double> temps = Arrays.asList(99.5, 102.5, 104.2, 90.8, 33.7);

        Long tempsGreaterThan100 =  temps
                .stream() //create the stream
                .peek(System.out::println) //print the value
                .filter(t -> t > 100) //filter the values
                .peek(System.out::println) //print the value
                .count(); //2

        System.out.println(tempsGreaterThan100);


        List<String> lista = Arrays.asList("a", "b", "c", "d");

        lista.stream()
                .filter(s -> s.contains("a")) //filter the values
                .forEach(System.out::println); //print the value







        //ParallelStream
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long count = numeros.parallelStream()
                .filter(numero -> numero % 2 == 0)
                .count();

        System.out.println("Quantidade de números pares: " + count);



    }
}
