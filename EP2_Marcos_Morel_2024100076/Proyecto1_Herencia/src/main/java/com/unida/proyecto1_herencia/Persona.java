package com.unida.proyecto1_herencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorioasu
 */
public class Persona {
    
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
    }
}

