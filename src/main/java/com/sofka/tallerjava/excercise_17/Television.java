package com.sofka.tallerjava.excercise_17;

public class Television extends Electrodomestico{
     Double resolucion = 20.0;
     Boolean sintonizadorTDT = false;

    public Television() {

    }

    public Television(Double precio, Double peso) {
        super(precio, peso);
    }

    public Television(Double precioBase, Double peso, Character consumoenergetico, String color, Double resolucion, Boolean sintonizadorTDT) {
        super(precioBase, peso, consumoenergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public Double precioFinal() {
        if(this.resolucion>40)
        {
            return super.precioFinal()*1.3;
        }

        if(this.resolucion>40&&this.sintonizadorTDT)
        {
            return super.precioFinal()*1.3+50;
        }
        return super.precioFinal();
    }
}
