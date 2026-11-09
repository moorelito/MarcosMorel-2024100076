package com.unida.proyecto2_polimorfismo;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override // Anotación de sobreescritura
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau!");
    }
}