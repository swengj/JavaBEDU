package sesion02.reto02;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var saldo = 1000.0; // Saldo inicial
        int opcion; // Variable para almacenar la opción del menú

        // Repetir el menú de opciones
        do {
            // Muestra menú de opciones
            System.out.println("Bienvenido al cajero automático" +
                    "\n1. Consultar saldo" +
                    "\n2. Depositar dinero" +
                    "\n3. Retirar dinero" +
                    "\n4. Salir");
            opcion = scanner.nextInt(); // Leer la opción elegida por el usuario

            // Estructura switch para manejar las opciones del menú
            switch (opcion) {
                // Consultar saldo
                case 1 -> System.out.println("Tu saldo actual es: $" + saldo);
                // Depositar dinero
                case 2 -> {
                    System.out.println("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    // Validar que el monto sea mayor que cero
                    if ( deposito <= 0) {
                        System.out.println("El monto debe ser mayor que cero");
                        continue; // Volver al menú sin modificar el saldo
                    }

                    saldo += deposito; // Aumentar el saldo
                    System.out.println("Depósito realizado. Saldo actualizado: $" + saldo);
                }
                // Retirar dinero
                case 3 -> {
                    System.out.println("Ingresa el monto a retirar:");
                    double retiro = scanner.nextDouble();

                    // Validar que el monto sea mayor que cero
                    if (retiro <= 0){
                        System.out.println("El monto debe ser mayor que cero");
                        continue; // Volver al menú sin hacer nada
                    }

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $" +  saldo);
                    } else {
                        saldo -= retiro; // Restar el monto al saldo
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                    }
                }
                // Salir del programa
                case 4 -> {
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                }
                // Opción no válida
                default -> System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (opcion != 4);
    }
}
