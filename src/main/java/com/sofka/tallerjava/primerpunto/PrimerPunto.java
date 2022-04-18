package com.sofka.tallerjava.primerpunto;

public class PrimerPunto {

    public static void comparar (Integer x, Integer y){
        if (x>y){
            System.out.println("El numero "+x+" es Mayor");
            return;
        }
        menorIgual(x,y);
    }
    public static void menorIgual(Integer x, Integer y){
        if (x < y) {
            System.out.println("El numero " + y + " es Mayor");
            return;
        }
        System.out.println("Los numeros son iguales");
        }


    public static void main(String[] args) {
        Integer valorUno=35;
        Integer valorDos=35;
        comparar(valorUno,valorDos);


    }
}
