package com.mycompany.tarea7_cajero;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tarea7_Cajero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 500000; // Saldo inicial: Gs. 500.000
        int opcion;
        double monto;

        do {
            System.out.println("\n===== CAJERO AUTOMATICO =====");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: Gs. " + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: Gs. ");
                    monto = scanner.nextDouble();
                    if (monto > 0) {
                        saldo = saldo + monto;
                        System.out.println("Depósito realizado. Nuevo saldo: Gs. " + saldo);
                    } else {
                        System.out.println("El monto debe ser mayor a cero.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: Gs. ");
                    monto = scanner.nextDouble();
                    if (monto <= 0) {
                        System.out.println("El monto debe ser mayor a cero.");
                    } else if (monto > saldo) {
                        System.out.println("Saldo insuficiente. Su saldo actual es: Gs. " + saldo);
                    } else {
                        saldo = saldo - monto;
                        System.out.println("Retiro realizado. Nuevo saldo: Gs. " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}