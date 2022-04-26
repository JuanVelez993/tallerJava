package com.sofka.tallerjava.excercise_17;

import java.util.Locale;

public class Electrodomestico {

    private static final String COLORDEFAULT = "blanco";
    private static final Character CONSUMODEFAULT = 'F';
    private static final Double PRECIODEFAULT = 100.0;
    private static final Double PESODEFAULT = 5.0;
    Double precioBase;
    String color;
    Character consumoenergetico;
    Double peso;


    public Electrodomestico() {
        this.precioBase= PRECIODEFAULT;
        this.color= COLORDEFAULT;
        this.consumoenergetico= CONSUMODEFAULT;
        this.peso= PESODEFAULT;
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color= COLORDEFAULT;
        this.consumoenergetico= CONSUMODEFAULT;
    }

    public Electrodomestico(Double precioBase,  Double peso, Character consumoenergetico,String color) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.peso = peso;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoenergetico() {
        return consumoenergetico;
    }

    public Double getPeso() {
        return peso;
    }

    private void comprobarConsumoElectrico(Character consumoEnergetico) {
        Character consumoValidado = Character.toUpperCase(consumoEnergetico);
        Character consumos[]={'A','B','C','D','E','F'};
        boolean consumoValido=false;
        for(int i=0;i<consumos.length && !consumoValido;i++){
            if(consumos[i].equals(color)){
                consumoValido=true;
            }

        }
        if(consumoValido){
            this.consumoenergetico=consumoValidado;
        }else{
            this.consumoenergetico=consumoValidado;
        }

    }

    private void comprobarColor(String color){
        color.toLowerCase(Locale.ROOT);
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorValido=false;
        for(int i=0;i<colores.length && !colorValido;i++){
            if(colores[i].equals(color)){
                colorValido=true;
            }

        }
         if(colorValido){
            this.color=color;
        }else{
            this.color= COLORDEFAULT;
        }

    }

    public Double precioFinal()
    {   Double valorPeso=precioPeso();
        Double valorConsumo=precioConsumo();
        return this.precioBase+valorConsumo+valorPeso;


    }
    public Double precioPeso(){
        double valorPeso=10.0;
        if(this.peso>=20 && this.peso<=49){
            valorPeso=50;
        }
        if(this.peso>50 && this.peso<=79){
            valorPeso=80;
        }
        if(this.peso>80){
            valorPeso=100;
        }

        return valorPeso;
    }

    public Double precioConsumo(){
        Double valorConsumo=0.0;
        switch (this.consumoenergetico){
            case 'A':valorConsumo=100.0;
            break;
            case 'B':valorConsumo=80.0;
            break;
            case 'C':valorConsumo=60.0;
            break;
            case 'D':valorConsumo=50.0;
            break;
            case 'E':valorConsumo=30.0;
            break;
            case 'F':valorConsumo=10.0;
                break;
        }
        return valorConsumo;

    };


}
