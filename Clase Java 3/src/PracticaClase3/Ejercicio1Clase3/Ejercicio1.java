package PracticaClase3.Ejercicio1Clase3;

import PracticaClase3.Ejercicio;

import java.util.Arrays;

public class Ejercicio1 extends Ejercicio {

    public boolean esPar(int n){

        return (n%2==0);

    }

    @Override
    public void start(){

        System.out.println("Practica.Ejercicio1.Ejercicio 1: declarar un array con varias personas, ordenarlo y mostrarlo.");

        Persona[] personas = {new Persona(23043435, "Peron Carajo"),new Persona(18049913, "Hernan Rodriguez"), new Persona(40731275, "Ignacio Janeiro")};
        SortUtil.ordenar(personas);

        System.out.println(Arrays.toString(personas));
    }
}
