package PracticaClase3.Ejercicio8;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString(){
        return "El valor del area del "+ Object.class.getName() + " es: " + area();
    }

}
