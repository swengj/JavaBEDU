package sesion02.reto01;

import sesion01.reto01.Paciente;

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario los datos
        System.out.println("Nombre del medicamento: ");
        String medicamento = leer.nextLine();

        System.out.println("Precio unitario: ");
        double precio = leer.nextDouble();

        System.out.println("Cantidad: ");
        int cantidad = leer.nextInt();

        leer.close();

        // Cálculo del total
        var total = precio * cantidad;

        // Verificar si el total supera $500 para aplicar descuento
        boolean aplicaDescuento = total > 500;

        // Cálculo del descuento (15%)
        double descuento = aplicaDescuento ? total * 0.15 : 0;

        // Cálculo final del total con descuento
        double totalFinal = total - descuento;

        // Salida formateada
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

    }
}
