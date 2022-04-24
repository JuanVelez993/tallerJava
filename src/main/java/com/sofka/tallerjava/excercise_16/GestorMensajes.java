package com.sofka.tallerjava.excercise_16;

import java.util.Scanner;

public class GestorMensajes {

    public static String mensajePesoIdeal(int num){
        if(num==-1){
            return " esta por debajo del peso ideal";
        }
        return mensajeSobrePeso(num);
    }

    private static String mensajeSobrePeso(int num) {
        if(num==0){
            return " esta en el peso ideal";
        }
        return " esta por encima del peso ideal";
    }

    public static String mensajeMayorDeEdad(boolean mayorDeEdad){
        if (mayorDeEdad){
            return " es mayor de edad";
        }else {
            return " es menor de edad";
        }
    }

    public static String ingresoNombre(Scanner captura){
        String nombre=" ";
        System.out.println("Ingrese el nombre de la persona");
        nombre= captura.nextLine();
        return nombre;
    };
    public static Integer ingresoEdad(Scanner captura){
        Integer edad=0;
        System.out.println("Ingrese la edad de la persona");
        edad= captura.nextInt();
        return edad;
    };
    public static Character ingresoGenero(Scanner captura){
        Character genero='H';
        System.out.println("Ingrese el genero de la persona");
        genero= captura.next().charAt(0);
        return genero;
    };
    public static Double ingresoPeso(Scanner captura){
        Double peso=0.0;
        System.out.println("Ingrese el peso de la persona");
        peso= Double.parseDouble(captura.next());
        return peso;
    };

    public static Double ingresoAltura(Scanner captura){
        Double altura=0.0;
        System.out.println("Ingrese la altura de la persona");
        altura= Double.parseDouble(captura.next());
        return altura;
    };
}
