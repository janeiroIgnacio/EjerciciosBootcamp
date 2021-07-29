package PracticaClase3;

import java.util.ArrayList;

public class RadixSort {

    private static ArrayList<ArrayList<String>> createListas(){
        ArrayList<ArrayList<String>> listas = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            listas.add(new ArrayList<String>());
        }
        return listas;
    }

    private static String[] ordernarPorIndice(int indice, String[] sArr){

        ArrayList<ArrayList<String>> listas = createListas();

        for(String numero: sArr){
            listas.get(numero.charAt(indice)-48).add(numero);
        }

        ArrayList<String> newStrArray = new ArrayList<>();
        for(ArrayList<String> lista: listas){
            newStrArray.addAll(lista);
        }

        return newStrArray.toArray(new String[0]);

    }

    public static String[] ordenar(int[] arr){

        String[] sArr = StringUtils.toStringArray(arr);
        int maxLength = StringUtils.maxLength(sArr);
        StringUtils.lNormalize(sArr, '0');

        for(int i = maxLength - 1; i >= 0; i--) {
            sArr = ordernarPorIndice(i,sArr);
        }

        return sArr;
    }


}
