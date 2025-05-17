package sesion03.reto01;

public class Principal {
    public static void main(String[] args) {

        // Crear un pasajero
        Pasajero ana = new Pasajero("Ana Martínez", "bg95b5g898gfr");

        // Crear un vuelo
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // vuelo1.reservarAsiento("Mario Gonzalez", "fvfvtgt5g9t5ggt");

        // Reservar asiento
        boolean reservado = vuelo1.reservarAsiento(ana);
        if (reservado) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva");
        }

        // Mostrar itinerario
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...");
        vuelo1.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo1.obtenerItinerario());

        // Realizar una nueva reservación
        vuelo1.reservarAsiento("Mario Gonzalez", "fvfvtgt5g9t5ggt");
        System.out.println(vuelo1.obtenerItinerario());
    }
}
