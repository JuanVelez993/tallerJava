package com.sofka.tallerjava.excercise_18;

import java.util.ArrayList;

public class Videojuego implements Entregable<Videojuego>{
    private String titulo = "";
    private String genero = "";
    private int numeroHoras = 10;
    private String compania = "";
    private boolean entregado = false;

    public Videojuego() {
    }

    public Videojuego(String titulo, int numeroHoras) {
        this.titulo = titulo;
        this.numeroHoras = numeroHoras;
    }

    public Videojuego(String titulo, String genero, String compania, int numeroHoras) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.numeroHoras = numeroHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroHoras=" + numeroHoras +
                ", compañia='" + compania + '\'' +
                ", entregado=" + entregado
                ;
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;

    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Videojuego compareTo(Videojuego[] videojuegos) {

        Videojuego juegoMasHoras = videojuegos[0];
        for (int i = 0; i < videojuegos.length; i++){
            int numerodeHoras = videojuegos[i].numeroHoras;
            if (numerodeHoras > juegoMasHoras.numeroHoras){
                juegoMasHoras = videojuegos[i];

            }
        }
        return juegoMasHoras;

    }


    public static ArrayList<Videojuego>contarEntregados(Videojuego[] array) {
        ArrayList<Videojuego> arrayEntregados=new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(array[i].isEntregado()){
                arrayEntregados.add(array[i]);
            }


        }
        return arrayEntregados;
    }
}
