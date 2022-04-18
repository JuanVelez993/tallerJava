package com.sofka.tallerjava.quintopunto;

import java.util.ArrayList;
import java.util.List;

public class QuintoPunto {

    public static void contar(Integer i){
        boolean valorNumero;
        while(i<=100){
            valorNumero=esPar(i);
            imprimirTipo(valorNumero,i);
            i++;
        }

    }
    public static boolean esPar(Integer x){
        return x%2==0;
    }

    public static void imprimirTipo(boolean tipo,Integer x){
        if (tipo){
            System.out.println("El numero "+x+" es par.");
            return;
        }
            System.out.println("El numero "+x+" es impar.");

    }

    public static void main(String[] args) {
        Integer i=1;
        contar(i);


    }
}
