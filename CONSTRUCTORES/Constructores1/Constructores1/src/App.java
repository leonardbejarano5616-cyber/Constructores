package Constructores1.Constructores1.src;

public class App {
    public static void main(String[] args) {

        Libro libro1 = new Libro();

        Libro libro2 = new Libro(
                "Don Quijote",
                "Miguel de Cervantes");

        Libro libro3 = new Libro(
                "Cien Años de Soledad",
                "Gabriel Garcia Marquez",
                false);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
    }
}