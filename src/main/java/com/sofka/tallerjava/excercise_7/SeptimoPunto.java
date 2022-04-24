package com.sofka.tallerjava.excercise_7;

import java.util.Scanner;

public class SeptimoPunto {

    public static boolean esMayor(Double x){
        return x>=0;
    }

    public static void main(String args[]) {
        Double numero;
        Scanner captura=new Scanner(System.in);
        boolean i=false ;
        do {
            System.out.println("Ingrese un numero:");
            numero= captura.nextDouble();
            i=esMayor(numero);

        } while(!i);
        System.out.println("El numero "+numero+" es mayor o igual a cero");
    }
}
