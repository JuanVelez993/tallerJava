package com.sofka.tallerjava.excercise_15;

import java.util.Scanner;

public class Menu {


    public static void mostrarMenu(String[] opciones) {

        for (String opcion : opciones) {
            System.out.println(opcion);
        }
    }

    public static void gestionCine(){
        String[] opcionesMenu = new String[]{"******GESTION CINEMATOGRAFICA******",
                "1-NUEVO ACTOR", "2-BUSCAR ACTOR", "3-ELIMINAR ACTOR", "4-MODIFICAR ACTOR", "5-VER TODOS LOS ACTORES"
                , "6-VER PELICULAS DE LOS ACTORES", "7-VER CATEGORIAS DE LAS PELICULAS DE LOS ACTORES", "8-SALIR"};
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean menu = true;
        do {
            Menu.mostrarMenu(opcionesMenu);

            opcion = scanner.nextInt();
            switch (opcion) {
                case 8:
                    System.out.println("Hasta la Proxima");
                    menu = false;
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    default:
                    System.out.println("Por favor seleccione una opcion entre 1 y 8)");
            }

        } while (menu);
    }
}