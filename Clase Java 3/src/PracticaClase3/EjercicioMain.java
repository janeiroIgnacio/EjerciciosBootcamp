package PracticaClase3;

import java.util.Scanner;
import PracticaClase3.EjercicioEnum;

public class EjercicioMain {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un ejercicio: ");
        String numeroEjercicio = scanner.next();

        Ejercicio ejercicio = PracticaClase3.EjercicioEnum.valueOf("EJERCICIO"+numeroEjercicio).getEjercicio();
        ejercicio.start();

        scanner.close();
    }
}
