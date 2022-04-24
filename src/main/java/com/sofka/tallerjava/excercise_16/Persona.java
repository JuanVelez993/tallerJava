package com.sofka.tallerjava.excercise_16;

import java.util.Random;

public class Persona {
    private String nombre;
    private Integer edad;
    private String DNI;
    private Character genero;
    private Double peso;
    private Double altura;

    public Persona() {
        this.nombre = " ";
        this.edad = 0;
        this.genero = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
        this.DNI=generarDNI(numeroDNI());
    }

    public Persona(String nombre, Integer edad, Character genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = 0.0;
        this.altura = 0.0;
        this.DNI=generarDNI(numeroDNI());
    }

    public Persona(String nombre, Integer edad,Character genero, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.DNI=generarDNI(numeroDNI());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", genero=" + genero +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public Integer calcularIndice(Double peso, Double altura){
        return (int)(peso/(altura*altura));
    }

    public Integer calcularMC(Integer indice){
        if (indice<20){
            return -1;
        }
        return calcularSobrePeso(indice);
    };

    public Integer calcularSobrePeso(Integer indice){
        if (indice<25){
            return 1;
        }
        return 0;
    };

    public Boolean esMayorDeEdad(Integer edad){
        return (edad<=18);
    };

    public Character comprobarGenero(Character genero){
        if (genero == 'H'){
            return 'H';
        }
        return comprobarMujer(genero);
    }
    public Character comprobarMujer(Character genero){
        if (genero == 'M'){
            return 'M';
        }
        return 'H';
    }

    public Integer numeroDNI(){
        Random rnd = new Random();
        int number = rnd.nextInt(99999999);

        return number;
    };

    public String generarDNI(Integer num){
        Integer letraDNI = num % 23;
        String listaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String valorDNI= String.valueOf(num) + listaLetras.charAt(letraDNI);
        return valorDNI;
    };
}

