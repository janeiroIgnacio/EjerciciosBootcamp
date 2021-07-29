package PracticaClase3.Ejercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha{

    private GregorianCalendar fecha;

    public Fecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        return "La fecha es: " + this.fecha.toString();
    }

    public void sumarDia(int dias){
        this.fecha.add(Calendar.DAY_OF_MONTH, dias);
    }

    public void sumarUnDia(){
        sumarDia(1);
    }

    public boolean mismaFecha(Fecha fecha){
        return equals(fecha);
    }

}
