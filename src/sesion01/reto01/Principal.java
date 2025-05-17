package sesion01.reto01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.println("Ingrese el nombre del paciente: ");
        p1.nombre = leer.nextLine();

        System.out.println("Ingrese la edad del paciente: ");
        p1.edad = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el número de expediente del paciente: ");
        p1.numeroExpediente = leer.nextLine();

        leer.close();

        p1.mostrarInformacion();
    }
}
