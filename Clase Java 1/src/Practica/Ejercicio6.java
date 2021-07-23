package Practica;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 extends Ejercicio {

    @Override
    public void start(){

        System.out.println("Ejercicio 6: implementacion de RadixSort.");
        int[] iArr = {4,5,32,21,432,3};
        System.out.println(Arrays.toString(RadixSort.ordenar(iArr)));

    }
}
