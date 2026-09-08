/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unida;

/**
 *
 * @author laboratorioasu
 */
public class Calculadora {
    
    //Metodos para sumar dos numeros
    public int sumar (int a, int b){
        return a + b; 
    }
    public int sumar (int a, int b, int c){
        
        return a + b + c;
    }

    public static void main(String[] args) {
        
        Calculadora calc  = new Calculadora();
        
        System.out.println("Suma de dos numeros " + calc.sumar(1,2));
        System.out.println("Suma de tres numeros " + calc.sumar(1,2,3));
         
    }
}
