package com.sofka.tallerjava.excercise_16;

public class GestorMensajes {

    public static String mensajePesoIdeal(int num){
        if(num==-1){
            return "Estas por debajo del peso ideal";
        }
        return mensajeSobrePeso(num);
    }

    private static String mensajeSobrePeso(int num) {
        if(num==0){
            return "Estas en el peso ideal";
        }
        return "Estas por encima del peso ideal";
    }
}
