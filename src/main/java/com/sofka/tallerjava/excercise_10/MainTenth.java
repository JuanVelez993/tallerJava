package com.sofka.tallerjava.excercise_10;

import java.util.Scanner;

public class MainTenth {

    public static String quitarEspacios(String frase){
        return frase.replaceAll("\\s+","");
    }
    public static void main(String[] args) {
        String conEspacios;
        String sinEspacios;
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        conEspacios=captura.nextLine();
        sinEspacios=quitarEspacios(conEspacios);
        System.out.println(sinEspacios);
    }
}
