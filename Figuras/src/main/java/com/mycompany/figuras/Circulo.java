package com.mycompany.figuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */

public class Circulo extends Figura {

    double radio;

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
