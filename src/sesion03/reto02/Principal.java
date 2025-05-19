package sesion03.reto02;

public class Principal {
    public static void main(String[] args) {
        // Factura con RFC
        Factura f1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Factura sin RFC (se pasa null)
        Factura f2 = new Factura(1800.0, "Reparación de equipo", null);

        // Mostrar ambas facturas
        System.out.println(f1.getResumen());
        System.out.println(f2.getResumen());
    }
}
