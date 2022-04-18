package com.sofka.tallerjava.decimopunto;

import java.util.Scanner;

public class DecimoPunto {

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
