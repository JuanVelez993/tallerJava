package com.sofka.tallerjava.excercise_8;

import java.util.Locale;
import java.util.Scanner;

public class OctavoPunto {

    public static void main(String[] args) {
        String diaEvaluado;
        String esLaboral=" es un dia laboral";
        String noesLaboral=" no es un dia laboral";
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        diaEvaluado= captura.next().toLowerCase(Locale.ROOT);
        switch(diaEvaluado) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(diaEvaluado.concat(esLaboral));
                break;
            case "sabado":
            case "domingo":
                System.out.println(diaEvaluado.concat(noesLaboral));
                break;
            default:
                System.out.println("La palabra ingresada no es una dia de la semana");
        }
    }
}

