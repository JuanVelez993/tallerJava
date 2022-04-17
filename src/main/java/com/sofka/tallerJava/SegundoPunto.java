package com.sofka.tallerJava;

import java.util.Scanner;

public class SegundoPunto {
    public static void comparar (Integer x, Integer y){
        int compare = Integer.compare(x, y);
        if (compare>0){
            System.out.println("El numero "+x+" es Mayor, y el numero "+y+" es Menor");
        }else if (compare < 0) {
            System.out.println("El numero " + y + " es Mayor, y el numero "+x+" es Menor");
        } else {
            System.out.println("Los dos numeros son iguales");
        }
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
