package com.unida.proyecto1_herencia;

public class Estudiante extends Persona {
    private final String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre); // Llama al constructor de Persona
        this.carrera = carrera;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + " | Carrera: " + carrera);
    }
}