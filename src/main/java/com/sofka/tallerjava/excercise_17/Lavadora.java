package com.sofka.tallerjava.excercise_17;

public class Lavadora extends Electrodomestico{
    Double carga=5.0;

    public Lavadora() {
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Lavadora( Double carga) {
        super();
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }
}
