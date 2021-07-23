package Practica;

import java.util.Scanner;

public class Ejercicio1 extends Ejercicio{

    public boolean esPar(int n){

        return (n%2==0);

    }

    @Override
    public void start(){
        System.out.println("Ejercicio 1: mostrar los primeros n números pares, siendo n un valor que el usuario ingresará por consola.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar un numero: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){

            if(esPar(i)) {
                System.out.println("el numero " + i + " es par");
            }

        }

        scanner.close();

    }
}
