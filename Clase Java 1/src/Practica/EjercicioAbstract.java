package Practica;

public abstract class EjercicioAbstract {

    public boolean esPrimo(int n){

        for(int i = 2; i < (n/2); i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public abstract void start();

}
