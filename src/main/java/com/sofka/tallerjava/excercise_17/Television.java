package com.sofka.tallerjava.excercise_17;

public class Television extends Electrodomestico{
     Double resolucion = 20.0;
     Boolean sintonizadorTDT = false;

    public Television() {

    }

    public Television(Double precio, Double peso) {
        super(precio, peso);
    }

    public Television(double resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }
}
