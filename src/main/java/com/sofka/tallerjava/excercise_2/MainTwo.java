package com.sofka.tallerjava.excercise_2;

import java.util.Scanner;

public class MainTwo {
    public static void comparar (Integer x, Integer y){
        if (x>y){
            System.out.println("El numero "+x+" es Mayor, y el numero "+y+" es Menor");
            return;
        }
        menorIgual(x,y);
    }
    public static void menorIgual(Integer x, Integer y){
        if (x < y) {
            System.out.println("El numero " + y + " es Mayor, y el numero "+x+" es Menor");
            return;
        }
        System.out.println("Los numeros son iguales");
    }
    public static void main(String[] args) {
        Integer valorUno;
        Integer valorDos;
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        valorUno=Integer.parseInt(captura.next());
        System.out.println("Ingrese otro numero ");
        valorDos=Integer.parseInt(captura.next());
        comparar(valorUno,valorDos);


    }
}
