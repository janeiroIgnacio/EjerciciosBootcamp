package PracticaClase3;

import PracticaClase3.Ejercicio1Clase3.Ejercicio1;
import PracticaClase3.Ejercicio2.Ejercicio2;
import PracticaClase3.Ejercicio3.Ejercicio3;
import PracticaClase3.Ejercicio4.Ejercicio4;
import PracticaClase3.Ejercicio5.Ejercicio5;
import PracticaClase3.Ejercicio7.Ejercicio7;
import PracticaClase3.Ejercicio8.Ejercicio8;

public class EjercicioFactory {

    public Ejercicio1 ejercicio1(){ return new Ejercicio1(); }

    public Ejercicio2 ejercicio2(){
        return new Ejercicio2();
    }

    public Ejercicio3 ejercicio3(){
        return new Ejercicio3();
    }

    public Ejercicio4 ejercicio4(){
        return new Ejercicio4();
    }

    public Ejercicio5 ejercicio5(){
        return new Ejercicio5();
    }

    public Ejercicio7 ejercicio7(){
        return new Ejercicio7();
    }

    public Ejercicio8 ejercicio8(){
        return new Ejercicio8();
    }

}
