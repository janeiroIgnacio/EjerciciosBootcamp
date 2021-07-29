package PracticaClase3.Ejercicio4;

public class Fraccion{

    private double numerador;
    private double denominador;

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public void sumar(Fraccion fraccion){
        numerador = (numerador * fraccion.getDenominador()) + (denominador * fraccion.getNumerador());
        denominador = (denominador * fraccion.getDenominador());
    }

    public void restar(Fraccion fraccion){
        numerador = (numerador * fraccion.getDenominador()) - (denominador * fraccion.getNumerador());
        denominador = (denominador * fraccion.getDenominador());
    }

    public void dividir(Fraccion fraccion){
        numerador *= fraccion.getDenominador();
        denominador *= fraccion.getNumerador();
    }

    public void multiplicar(Fraccion fraccion){
        numerador *= fraccion.getNumerador();
        numerador *= fraccion.getDenominador();
    }

    public void sumar(int entero){
        numerador += denominador*entero;
    }

    public void restar(int entero){
        numerador -= denominador*entero;
    }

    public void dividir(int entero){
        denominador *= entero;
    }

    public void multiplicar(int entero){
        numerador *= entero;
    }

}
