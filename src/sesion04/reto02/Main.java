package sesion04.reto02;

public class Main {
    public static void main(String[] args) {
        // Creamos una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Creamos una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // Mostramos la información
        System.out.println("\uD83D\uDCC4 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        System.out.println(cuenta);

        // Validamos si el RFC de la declaración es válido
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + cuenta.validarRFC(declaracion));
    }
}
