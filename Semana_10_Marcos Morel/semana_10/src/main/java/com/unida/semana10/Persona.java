
package com.unida.semana10;

public class Persona {

   
    protected String nombre;
    protected String cedula;

    
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

        @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cedula: " + cedula;
    }
}