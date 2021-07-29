package PracticaClase3.Ejercicio8;

public class Rectangulo extends FiguraGeometrica {

    private static double PI = 3.1416;
    private double base;
    private double altura;

    @Override
    public double area() {
        return base*altura;
    }

}
