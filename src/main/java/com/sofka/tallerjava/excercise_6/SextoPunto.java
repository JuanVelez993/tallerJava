package com.sofka.tallerjava.excercise_6;

public class SextoPunto {
    public static void contar(){
        boolean valorNumero;
        for(int i=1;i<=100;i++){
            valorNumero=esPar(i);
            imprimirTipo(valorNumero,i);

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
        contar();


    }
}
