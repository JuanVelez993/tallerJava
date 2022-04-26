package com.sofka.tallerjava.excercise_13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainThirteenth {

    public static void formatoFecha(LocalDateTime fecha){
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("(YYYY/MM/dd) (HH:MM:SS)");
        System.out.println(formatoFecha.format(fecha));

    }
    public static void main(String[] args) {
        LocalDateTime fechaActual=LocalDateTime.now();
        formatoFecha(fechaActual);
    }
}
