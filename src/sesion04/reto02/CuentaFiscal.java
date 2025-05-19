package sesion04.reto02;

import java.util.Objects;

public class CuentaFiscal {
    private final String rfc; // No se modifica después del constructor
    private double saldoDisponible;

    // Constructor con validación del saldo
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible < 0) {
            System.out.println("El saldo no puede ser negativo");
        } else {
            this.saldoDisponible = saldoDisponible;
        }
    }

    // Getters
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Método que valida si el RFC de la declaración coincide con el RFC de la cuenta
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    // Método para mostrar información de la cuenta
    @Override
    public String toString() {
        return "\uD83C\uDFE6 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible;
    }
}
