package com.sofka.tallerjava.excercise_4;

import java.util.Scanner;

public class MainFourth {
    public static void main(String[] args) {
        final Double IVA=0.21;
        Double precioProducto;
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        precioProducto = captura.nextDouble();
        System.out.println("El precio final del producto es "+(precioProducto+(precioProducto*IVA)));
    }
}
