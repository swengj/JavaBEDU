package sesion03.ejemplo02;

public class Metodos {
    // 1️⃣ Método sin parámetros y sin retorno
    public void mostrarBienvenida() {
        System.out.println("👋 Bienvenido al sistema");
    }

    // 2️⃣ Método con parámetros y sin retorno
    public void mostrarSuma(int a, int b) {
        int resultado = a + b;
        System.out.println("➕ La suma es: " + resultado);
    }

    // 3️⃣ Método con parámetros y con retorno
    public int obtenerSuma(int a, int b) {
        return a + b;
    }

    // 4️⃣ Paso por valor (tipos primitivos)
    public void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método: " + numero);
    }

    // 5️⃣ Paso por referencia (objetos)
    public void cambiarNombre(Persona p) {
        p.nombre = "Nuevo nombre";
    }

    // 6️⃣ Sobrecarga de métodos
    public void saludar() {
        System.out.println("👋 Hola");
    }

    public void saludar(String nombre) {
        System.out.println("👋 Hola, " + nombre);
    }
}
