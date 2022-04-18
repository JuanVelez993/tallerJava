package com.sofka.tallerjava.novenopunto;

import java.util.Scanner;

public class NovenoPunto {

    public static String unirTextos(String fraseUno){
        Scanner captura=new Scanner(System.in);
        String textoNuevo;
        System.out.println("Ingrese la frase que quiere unir: ");
        textoNuevo= captura.nextLine();
        return fraseUno.concat(textoNuevo);
    }

    public static void main(String[] args) {
        String textoBase="La sonrisa sera la mejor arma contra la tristeza";
        String textoBaseConEs=textoBase.replace("a","e");
        String textosUnidos=unirTextos(textoBaseConEs);
        System.out.println(textosUnidos);
    }
}
