package com.unida.semana10;


public class Estudiante extends Persona {

    
    private String matricula;
    private String carrera;

    
    public Estudiante(String nombre, String cedula, String matricula, String carrera) {
      
        super(nombre, cedula);
        this.matricula = matricula;
        this.carrera = carrera;
    }

   
    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Carrera: " + carrera;
    }
}