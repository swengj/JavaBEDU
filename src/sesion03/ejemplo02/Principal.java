package sesion03.ejemplo02;

public class Principal {
    public static void main(String[] args) {
        Metodos metodo = new Metodos();

        // 1️⃣ Método sin parámetros y sin retorno
        metodo.mostrarBienvenida(); // Se realiza la llamada al método.

        // 2️⃣ Método con parámetros y sin retorno
        metodo.mostrarSuma(10, 20); // Se establecen dos argumentos.

        // 3️⃣ Método con parámetros y con retorno
        int suma = metodo.obtenerSuma(5, 7);
        System.out.println("🧮 Resultado: " + suma);

        // 4️⃣ Paso por valor (tipos primitivos)
        int x = 10;
        metodo.duplicar(x);
        System.out.println("Fuera del método: " + x);  // x no cambia

        // 5️⃣ Paso por referencia (objetos)
        Persona persona = new Persona("Mario");
        metodo.cambiarNombre(persona);
        System.out.println("Nombre actualizado: " + persona.nombre);

        // 6️⃣ Sobrecarga de métodos
        metodo.saludar();                   // Hola
        metodo.saludar("Mario");     // Hola, Mario
    }
}
