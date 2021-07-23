package Practica;

import java.util.Scanner;

public class Ejercicio5 extends Ejercicio{

    int n;
    int m;
    char d;
    int apariciones = 0;

    public int cantidadDeDigitos(int numero){

        String numeroStr = Integer.toString(numero);
        return (int) numeroStr.chars().filter(ch -> ch == d).count();

    }

    public boolean continuar(int apariciones){
        return !(m==apariciones);
    }

    @Override
    public void start(){
        System.out.println("Ejercicio 5: mostrar por consola los primeros n números naturales que tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar n: ");
        n = scanner.nextInt();
        System.out.print("Ingresar m: ");
        m = scanner.nextInt();
        System.out.print("Ingresar d: ");
        d = scanner.next().charAt(0);

        int i = 1;
        while(continuar(apariciones)){

            if(cantidadDeDigitos(i) >= m ){
                System.out.println("Numero: "+i);
                apariciones += 1;
            }

            i++;

        }
        
        scanner.close();

    }
}
