package com.sofka.tallerjava.excercise_18;


import java.util.ArrayList;

public interface Entregable<T> {
    public void entregar();
    public void devolver();
    public boolean isEntregado();
    public T compareTo(T[] t);


}
