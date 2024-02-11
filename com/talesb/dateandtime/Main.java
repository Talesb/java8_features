package com.talesb.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {


    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);

        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Amanhã: " + amanha);

        LocalTime agora = LocalTime.now();
        System.out.println("Hora atual: " + agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataHoraAtual);

    }
}
