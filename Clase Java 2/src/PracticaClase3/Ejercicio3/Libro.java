package PracticaClase3.Ejercicio3;

public class Libro{

    private LibroEstadoEnum estado;
    private String titulo;
    private String autor;

    public Libro(LibroEstadoEnum estado, String titulo, String autor) {
        this.estado = estado;
        this.titulo = titulo;
        this.autor = autor;
    }

    public void prestamo(){
        this.estado = LibroEstadoEnum.PRESTAMO;
    }

    public void devolucion(){
        this.estado = LibroEstadoEnum.DEVOLUCION;
    }

    public String toString(){
        return "Titulo: " + this.titulo + ", autor: " + this.autor + ", estado: " + this.estado;
    }

    public String getEstado() {
        return estado.getString();
    }

    public void setEstado(String estado) {
        this.estado = LibroEstadoEnum.valueOf(estado);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
