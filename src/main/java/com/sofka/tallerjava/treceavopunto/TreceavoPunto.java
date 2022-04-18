package com.sofka.tallerjava.treceavopunto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TreceavoPunto {

    public static void formatoFecha(LocalDateTime fecha){
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("(YYYY/MM/DD) (HH:MM:SS)");
        System.out.println(formatoFecha.format(fecha));

    }
    public static void main(String[] args) {
        LocalDateTime fechaActual=LocalDateTime.now();
        formatoFecha(fechaActual);
    }
}
