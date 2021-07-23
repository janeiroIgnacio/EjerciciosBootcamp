package Practica;

import java.util.Scanner;

public class Ejercicio2 extends Ejercicio{

    public boolean esMultiplo(int m, int n){

        return (m%n==0);

    }

    @Override
    public void start(){
        System.out.println("Ejercicio 2: mostrar los primeros n múltiplos de m, siendo n y m valores que el usuario ingresará por consola.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar n: ");
        int n = scanner.nextInt();
        System.out.print("Ingresar m: ");
        int m = scanner.nextInt();

        for(int i = 1; i <= n; i++){

            if(esMultiplo(m,i)) {
                System.out.println("el numero " + i + " es multiplo de "+ m);
            }

        }

        scanner.close();

    }
}
