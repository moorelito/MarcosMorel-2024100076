package com.unida.proyecto2_polimorfismo;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido(); // Método abstracto sin cuerpo
}