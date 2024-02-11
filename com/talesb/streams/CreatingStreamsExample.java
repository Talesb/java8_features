package com.talesb.streams;
import java.util.*;
import java.util.stream.Stream;

public class CreatingStreamsExample {


    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("John", "Sarah", "Mark");
        Stream<String> namesStream = namesList.stream();
        System.out.println("Quantity of names= "+namesStream.count());


        Map<String,Integer> namesAndAges = new HashMap<>();
        namesAndAges.put("John", 25);
        namesAndAges.put("Sarah", 30);
        namesAndAges.put("Mark", 28);

        Stream<String> namesStream2 = namesAndAges.keySet().stream();
        System.out.println("Quantity of names= "+namesStream2.count());

        Stream<Integer> agesStream = namesAndAges.values().stream();
        System.out.println("Quantity of ages= "+agesStream.count());

        // Method that accepts a varargs and returns a ordered stream of those elements
       Stream any = Stream.of(new Object());
       System.out.println(any.count());



    }


}
