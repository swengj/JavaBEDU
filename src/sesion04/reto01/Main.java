package sesion04.reto01;

public class Main {
    public static void main(String[] args) {
        // Creamos dos facturas con el mismo folio
        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        // Mostramos ambas facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

        // Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));

        // Hash codes
        System.out.println("Hash de f1: " + f1.hashCode());
        System.out.println("Hash de f2: " + f2.hashCode());
    }
}
