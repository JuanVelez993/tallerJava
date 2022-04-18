package com.sofka.tallerjava.septimopunto;

import java.util.Scanner;

public class SeptimoPunto {

    public static void main(String args[]) {
        Double numero;
        Scanner captura=new Scanner(System.in);
        System.out.println("ingrese un numero:");
        numero= captura.nextDouble();
        int i = 0;

        while(i != 0) {
            System.out.println("WHILE");  // No se ejecuta.
        }

        do {
            System.out.println("DO-WHILE"); // Se ejecuta una vez.
        } while(i != 0);
    }
}
