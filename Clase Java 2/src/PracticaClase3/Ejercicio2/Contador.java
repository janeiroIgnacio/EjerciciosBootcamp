package PracticaClase3.Ejercicio2;

public class Contador{

    private int contador;

    public Contador() {
        //Aunque int por default es cero no se si es necesario implementarlo
        this.contador = 0;
    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public Contador(Contador contador) {
        this.contador = contador.getContador();
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }
}
