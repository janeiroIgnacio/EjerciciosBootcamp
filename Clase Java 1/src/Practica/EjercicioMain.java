package Practica;

import java.util.Scanner;

public class EjercicioMain {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un ejercicio: ");
        String numeroEjercicio = scanner.next();

        EjercicioAbstract ejercicio = EjercicioEnum.valueOf("EJERCICIO"+numeroEjercicio).getEjercicio();
        ejercicio.start();

        scanner.close();
    }
}
