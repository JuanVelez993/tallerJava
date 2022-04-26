package com.sofka.tallerjava.excercise_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSixteenth {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        Scanner captura=new Scanner(System.in);
        String nombre=GestorMensajes.ingresoNombre(captura);
        Integer edad=GestorMensajes.ingresoEdad(captura);
        Character genero=GestorMensajes.ingresoGenero(captura);
        genero=Persona.comprobarGenero(genero);
        Double peso=GestorMensajes.ingresoPeso(captura);
        Double altura=GestorMensajes.ingresoAltura(captura);
        Persona personaUno=new Persona(nombre,edad,genero,peso,altura);
        listaPersonas.add(personaUno);
        Persona personaDos= new Persona(nombre, edad, genero);
        personaDos.setPeso(73.0);
        personaDos.setAltura(1.63);
        listaPersonas.add(personaDos);
        Persona personaTres=new Persona();
        personaTres.setNombre("Juan");
        personaTres.setEdad(28);
        personaTres.setGenero('H');
        personaTres.setPeso(78.0);
        personaTres.setAltura(1.70);
        listaPersonas.add(personaTres);
        for (Persona persona : listaPersonas){
           Integer pesoIndice=persona.calcularMC(persona.getPeso(),persona.getAltura());
           Boolean esMayor=persona.esMayorDeEdad(persona.getEdad());
            System.out.println("La persona "+persona.getNombre()+GestorMensajes.mensajePesoIdeal(pesoIndice));
            System.out.println("La Persona "+persona.getNombre()+GestorMensajes.mensajeMayorDeEdad(esMayor));
            System.out.println(persona.toString());
            System.out.println("-----------------------------------------");
        };

    }
}
