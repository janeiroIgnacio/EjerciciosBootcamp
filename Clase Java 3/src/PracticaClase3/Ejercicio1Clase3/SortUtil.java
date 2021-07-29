package PracticaClase3.Ejercicio1Clase3;

public class SortUtil {

    public static <T extends Precedable<T>> void ordenar(T arr[]){

        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length-i; j++){
                if(arr[j].precedeA(arr[j+1]) < 1){
                    T var = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = var;
                };
            }
        }
    };

}
