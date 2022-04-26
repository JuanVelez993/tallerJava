package com.sofka.tallerjava.excercise_17;

public class Lavadora extends Electrodomestico{
    private static final Double CARGADEFAULT = 5.0;
    Double carga;

    public Lavadora() {
        this.carga= CARGADEFAULT;
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.carga= CARGADEFAULT;
    }

    public Lavadora(Double precioBase, String color, Character consumoenergetico, Double peso,Double carga) {
        super();
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    @Override
    public Double precioFinal() {
        if(this.carga>30)
        {
            return super.precioFinal()+50.0;
        }
        return super.precioFinal();
    }
}
