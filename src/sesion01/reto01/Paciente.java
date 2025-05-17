package sesion01.reto01;

public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nExpediente: " + numeroExpediente);
    }
}
