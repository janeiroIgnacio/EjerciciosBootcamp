package PracticaClase3.Ejercicio8;

public class Circulo extends FiguraGeometrica {

    private static double PI = 3.1416;
    private double radio;
    private double diametro;

    @Override
    public double area() {
        return PI*(radio*radio);
    }

}
