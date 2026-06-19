package Constructores1.Constructores1.src;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor vacío
    public Libro() {
        disponible = true;
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Constructor completo
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido.");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
        System.out.println();
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto.");
    }
}