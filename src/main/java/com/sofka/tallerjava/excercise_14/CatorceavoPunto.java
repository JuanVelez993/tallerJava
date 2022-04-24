package com.sofka.tallerjava.excercise_14;

import java.util.Scanner;

public class CatorceavoPunto {
    public static void contarHasta(Double valor){
        Double contador=valor;
        while (contador<=1000){
            System.out.println(contador);
            contador=aumentarValor(contador);
        }
    }

    public static Double aumentarValor(Double valor){
        return valor=valor+2;
    }

    public static void main(String[] args) {
        Double valor;
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        valor=captura.nextDouble();
        contarHasta(valor);
    }
}
