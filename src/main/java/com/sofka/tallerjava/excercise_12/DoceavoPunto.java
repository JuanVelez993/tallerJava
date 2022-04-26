package com.sofka.tallerjava.excercise_12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DoceavoPunto {

    public static void main(String[] args) {
            String palabra1 = "";
            String palabra2 = "";
            String palabraMasLarga;
            String palabraCorta;
            Scanner captura=new Scanner(System.in);
            System.out.println("Ingrese una palabra : ");
            palabra1= captura.nextLine();
            System.out.println("Ingrese una segunda palabra : ");
            palabra2= captura.nextLine();
            String palabra1Mayus = palabra1.toUpperCase();
            String palabra2Mayus = palabra2.toUpperCase();
            palabraMasLarga=palabra1Mayus;
            palabraCorta=palabra2Mayus;

            if (palabra1Mayus.equals(palabra2Mayus)){
                System.out.println("Las palabras son iguales");
            }else{
                masLarga(palabra1Mayus,palabra2Mayus,palabraMasLarga,palabraCorta);

                mostrarDiferencias(palabraMasLarga,palabraCorta);
            }
        }

        public static void mostrarDiferencias(String palabra1,String palabra2){
        String letrasDiferentes[]=palabra1.split("");
        for(String letra:letrasDiferentes){
            palabra2=palabra2.replaceFirst(letra,"");

        }
            System.out.println("Las letras de la segunda palabra,que la primera no contiene son : "+ palabra2);

        }

        public static void masLarga(String palabra1,String palabra2,String palabraMasLarga,String palabraCorta){
            if(palabra1.length()<=palabra2.length()){
               ;palabraMasLarga=palabra2;
                palabraCorta=palabra1;
            }

        }
    }


