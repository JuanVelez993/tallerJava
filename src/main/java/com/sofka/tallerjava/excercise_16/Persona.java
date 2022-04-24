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
        this.DNI = generarDNI(numeroDNI());
    }

    public Persona(String nombre, Integer edad, Character genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = 0.0;
        this.altura = 0.0;
        this.DNI = generarDNI(numeroDNI());
    }

    public Persona(String nombre, Integer edad, Character genero, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.DNI = generarDNI(numeroDNI());
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

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
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

    public static Integer calcularIMC(Integer indice) {
        if (indice < 20) {
            return -1;
        }
        return calcularSobrePeso(indice);
    }

    ;

    public static Integer calcularSobrePeso(Integer indice) {
        if (25 < indice) {
            return 1;
        }
        return 0;
    }

    ;

    public static Integer calcularMC(Double peso, Double altura) {
        return calcularIMC((int) (peso / (altura * altura)));

    }

    ;

    public Boolean esMayorDeEdad(Integer edad) {
        return (18 <= edad);
    }

    ;

    public static Character comprobarGenero(Character genero) {
        if (genero == 'H') {
            return 'H';
        }
        return comprobarMujer(genero);
    }

    public static Character comprobarMujer(Character genero) {
        if (genero == 'M') {
            return 'M';
        }
        return 'H';
    }

    public Integer numeroDNI() {
        Random rnd = new Random();
        int number = rnd.nextInt(99999999);

        return number;
    }

    ;

    public String generarDNI(Integer num) {
        Integer letraDNI = num % 23;
        String listaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String valorDNI = String.valueOf(num) + listaLetras.charAt(letraDNI);
        return valorDNI;
    }

    ;


}

