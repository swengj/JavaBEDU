package sesion03.reto01;

public class Pasajero {
    private String nombre;
    private String pasaporte;

    // Constructor
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }
}
