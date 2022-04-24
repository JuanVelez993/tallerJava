package com.sofka.tallerjava.excercise_11;

import java.util.Scanner;

public class OnceavoPunto {

    public static Integer longitudFrase(String frase){
        return frase.length();
    }
    public static Integer vocalesContenidas(String frase){
        return frase.replaceAll("[^AEIOUaeiou]","").length();

    }
    public static void mostrarResultado(Integer x,Integer y){
        System.out.println("La longitud de la frase es de "+x+" caracteres");
        System.out.println("La frase contiene "+y+" vocales");

    }

    public static void main(String[] args) {
        String fraseEvaluada;
        Integer longitudFrase;
        Integer totalVocales;
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese una frase a evaluar: ");
        fraseEvaluada= captura.nextLine();
        longitudFrase=longitudFrase(fraseEvaluada);
        totalVocales=vocalesContenidas(fraseEvaluada);
        mostrarResultado(longitudFrase,totalVocales);
    }
}
