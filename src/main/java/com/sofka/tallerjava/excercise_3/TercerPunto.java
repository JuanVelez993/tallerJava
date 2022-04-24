package com.sofka.tallerjava.excercise_3;

import java.util.Scanner;

public class TercerPunto {
    public static void main(String[] args) {
        System.out.print("Ingrese el radio del circulo: ");
        Scanner captura = new Scanner(System.in);
        Double radio = Double.parseDouble(captura.next());

        Double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es = "+area);
    }
}
