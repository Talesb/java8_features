package com.talesb.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(getValor());

        if (optional.isPresent()) {
            System.out.println("Valor presente: " + optional.get());
        } else {
            System.out.println("Valor ausente");
        }

    }

    private static String getValor() {
        return "Hello";
    }
}
