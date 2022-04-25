package com.sofka.tallerjava.excercise_18;

import java.util.ArrayList;

public class Serie implements Entregable<Serie> {
    private String titulo = "";
    private String genero = "";
    private String creador = "";
    private Integer numeroTemporadas = 3;
    private Boolean entregado = false;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado ;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;

    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Serie compareTo(Serie[] series) {

        Serie serieMasTemporadas = series[0];
        for (int i = 0; i < series.length; i++){
            int numeroDeTemporadas1 = series[i].numeroTemporadas;
            if (numeroDeTemporadas1 > serieMasTemporadas.numeroTemporadas){
                serieMasTemporadas = series[i];
            }
        }
        return serieMasTemporadas;
    };


    public static ArrayList<Serie>contarEntregados(Serie[] array) {
        ArrayList<Serie> arrayEntregados=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].isEntregado()) {
                arrayEntregados.add(array[i]);
            }

        }
        return arrayEntregados;
    }
}
