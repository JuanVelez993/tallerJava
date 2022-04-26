package com.sofka.tallerjava.excercise_17;

public class DiecisieteavoPunto {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos=new Electrodomestico[10];
        electrodomesticos[5]=new Lavadora(150.0,85.0);
        electrodomesticos[6]=new Lavadora(80.0,"verde",'B',65.0,25.0);
        electrodomesticos[7]=new Lavadora(300.0,90.0);
        electrodomesticos[8]=new Lavadora(250.0,"gris",'G',65.0,35.0);
        electrodomesticos[9]=new Electrodomestico(70.0,60.0);
        electrodomesticos[0] = new Television(80.0,50.0);
        electrodomesticos[1]= new Television(50.0,35.5,'B',"morado",30.0,true);
        electrodomesticos[2]= new Television(130.0,75.5,'C',"azul",40.0,false);
        electrodomesticos[3]= new Television(260.0,15.5,'D',"blanco",80.0,true);
        electrodomesticos[4]= new Electrodomestico(500.0,200.0,'A',"negro");


        Double totalElectrodomesticos=0.0;
        Double totalLavadoras=0.0;
        Double totalTelevisores=0.0;

         for(int i=0;i<electrodomesticos.length;i++){
           if(electrodomesticos[i] instanceof Electrodomestico){
                totalElectrodomesticos+=electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Lavadora){
                totalLavadoras+=electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Television){
                totalTelevisores+=electrodomesticos[i].precioFinal();
            }
        }

        System.out.println("El precio total de los electrodomesticos es de : "+totalElectrodomesticos);
        System.out.println("El precio total de las lavadoras es de : "+totalLavadoras);
        System.out.println("El precio total de los televisores es de : "+totalTelevisores);

    }
}
