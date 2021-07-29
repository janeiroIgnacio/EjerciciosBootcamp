package PracticaClase3.Ejercicio1Clase3;

public class Persona implements Precedable<Persona>{

    private Integer dni;
    private String nombre;

    public Persona(Integer dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int precedeA(Persona persona) {
        return this.dni.compareTo(persona.getDni());
    }

}
