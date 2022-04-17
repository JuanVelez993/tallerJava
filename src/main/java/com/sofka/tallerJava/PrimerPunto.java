package com.sofka.tallerJava;

public class PrimerPunto {

    public static void comparar (Integer x, Integer y){
        int compare = Integer.compare(x, y);
        if (compare>0){
            System.out.println("El numero "+x+" es Mayor");
        }else if (compare < 0) {
                System.out.println("El numero " + y + " es Mayor");
        } else {
                System.out.println("Los numeros son iguales");
        }
    }
    public static void main(String[] args) {
        Integer valorUno=23;
        Integer valorDos=33;
        comparar(valorUno,valorDos);


    }
}
