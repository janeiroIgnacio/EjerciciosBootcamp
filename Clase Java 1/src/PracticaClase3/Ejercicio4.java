package PracticaClase3;

import java.util.Scanner;

public class Ejercicio4 extends Ejercicio {

    @Override
    public void start(){
        System.out.println("Ejercicio 4: mostrar por consola los primeros n números primos, siendo n un valor que el usuario ingresará por consola.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar un valor: ");
        int n = scanner.nextInt();

        for(int i = 2; i<=n; i++){

            if(esPrimo(i)){
                System.out.println("el numero "+i+" es primo");
            }

        }

        scanner.close();

    }
}
