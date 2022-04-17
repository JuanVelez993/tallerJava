package com.sofka.tallerJava;

import java.util.Scanner;

public class CuartoPunto {
    public static void main(String[] args) {
        final double iva=0.21;
        Double precioProducto;
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        precioProducto = captura.nextDouble();
        System.out.println("El precio final del producto es "+(precioProducto+(precioProducto*iva)));
    }
}
