package com.mycompany.figuras;

public class Figuras {

    public static void main(String[] args) {

        // Creamos los objetos y les asignamos valores
        Circulo c1 = new Circulo();
        c1.radio = 5;

        Rectangulo r1 = new Rectangulo();
        r1.base = 4;
        r1.altura = 6;

        Circulo c2 = new Circulo();
        c2.radio = 2.5;

        // Arreglo de tipo Figura (polimorfismo)
        Figura[] figuras = new Figura[3];
        figuras[0] = c1;
        figuras[1] = r1;
        figuras[2] = c2;

        // Recorremos el arreglo con un bucle
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + (i + 1) + " -> Area: " + figuras[i].calcularArea());
        }
    }
}