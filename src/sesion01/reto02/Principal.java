package sesion01.reto02;

public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Harry Potter Show", 500.80);
        entrada1.mostrarInformacion();

        Entrada entrada2 = new Entrada("Harry Styles Concert", 900.48);
        entrada2.mostrarInformacion();

        // Reto adicional
        Entrada_Record entrada3 = new Entrada_Record("The Greatest Showman", 1500.50);
        entrada3.mostrarInformacion();
    }
}
