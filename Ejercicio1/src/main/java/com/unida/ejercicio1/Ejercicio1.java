/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unida.ejercicio1;

/**
 *
 * @author laboratorioasu
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        
        // Asignamos datos usando SET
        persona.setNombre("Juan");
        persona.setEdad(25);

        // Obtenemos e imprimimos datos usando GET
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}