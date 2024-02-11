package com.talesb.localization;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale ptBR = new Locale("pt", "BR");
        NumberFormat format = NumberFormat.getCurrencyInstance(ptBR);
        System.out.println(format.format(1000.50));

    }
}
