package Practica;

import java.util.Scanner;

public class Ejercicio3 extends Ejercicio {

    @Override
    public void start(){
        System.out.println("Ejercicio 3: informar si un número n es primo o no, siendo n un valor que el usuario ingresará por consola.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar n: ");
        int n = scanner.nextInt();

        if(esPrimo(n)){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }

        scanner.close();

    }
}
