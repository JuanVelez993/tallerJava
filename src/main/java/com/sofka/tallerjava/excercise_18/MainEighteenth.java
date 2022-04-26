package com.sofka.tallerjava.excercise_18;

import java.util.ArrayList;

public class MainEighteenth {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        series[0] = new Serie("Westworld", "ciencia ficcion","Jonathan Nolan", 3);
        series[1] = new Serie("Moon Knight", "super heroes","Jeremy Slater", 1);
        series[2] = new Serie("The expanse", "ciencia ficcion","Mark Fergus",6);
        series[3] = new Serie("Euphoria", "Sam Levinson");
        series[4] = new Serie("Attack on titan", "Hajime Isayama");
        videojuegos[0] = new Videojuego("Warframe", 45);
        videojuegos[1] = new Videojuego("Genshin impact","adventure","Hoyoverse", 130);
        videojuegos[2] = new Videojuego("The Witcher 3","open world","CDprojekt", 90);
        videojuegos[3] = new Videojuego("Fornite", 65);
        videojuegos[4] = new Videojuego("League of legends", 88);
        series[1].entregar();
        series[4].entregar();
        videojuegos[1].entregar();
        videojuegos[3].entregar();
        ArrayList<Serie> seriesEntregados=Serie.contarEntregados(series);
        ArrayList<Videojuego> videojuegosEntregados=Videojuego.contarEntregados(videojuegos);
        System.out.println("Las series entregadas son un total de "+seriesEntregados.size()+" y son:");
        System.out.println(seriesEntregados);
        System.out.println("Los videojuegos entregados son un total de "+videojuegosEntregados.size()+" y son:");
        System.out.println(videojuegosEntregados);
        System.out.println("La serie con mas temporadas es: "+ (series[0].compareTo(series)).toString());
        System.out.println("El juego con mas horas es: "+ (videojuegos[0].compareTo(videojuegos)).toString());






    }
}
