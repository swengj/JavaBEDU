package sesion03.reto02;

import java.util.Optional;

public class Factura {
    // Atributos privados para encapsular los datos
    private double monto; // cantidad total de la factura 💵
    private String descripcion; // breve concepto de lo facturado 🧾
    private Optional<String> rfc; // RFC del cliente (puede estar presente o no)

    // Constructor: convierte el RFC en Optional, puede ser null
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
        // this.rfc = (rfc == null) ? Optional.empty() : Optional.of(rfc);
    }

    // Método público que devuelve un resumen de la factura
    public String getResumen() {
        return "\uD83D\uDCC4 Factura generada: "
                + "\nDescripción: " + descripcion
                + "\nMonto: $" + monto
                + "\nRFC: " + rfc.orElse("[No proporcionado]") + "\n";
    }
}
