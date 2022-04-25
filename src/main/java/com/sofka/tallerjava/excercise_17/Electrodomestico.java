package com.sofka.tallerjava.excercise_17;

public class Electrodomestico {
    Double precioBase=100.0;
    String color="blanco";
    Character consumoenergetico;
    Double peso=5.0;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoenergetico, Double peso) {
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

    public void comprobarConsumoElectrico() {

    }

    public void comprobarColor(){

    }

    public void precioFinal(){

    }
}
