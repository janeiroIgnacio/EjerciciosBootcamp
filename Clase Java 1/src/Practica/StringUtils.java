package Practica;

public class StringUtils{

    public static String replicate(char c,int n){
        return String.valueOf(c).repeat(n);
    }

    public static String lpad(String s,int n,char c){
        return replicate(c, n-s.length()) + s;
    }

    public static String[] toStringArray(int arr[]){

        String[] sArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sArr[i] = String.valueOf(arr[i]);
        }

        return sArr;

    }

    public static int[] toIntArray(String arr[]){

        int[] iArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            iArr[i] = Integer.valueOf(arr[i]);
        }

        return iArr;

    }

    public static int maxLength(String arr[]){

        int maxLength = arr[0].length();

        for (String numero: arr) {

            if(numero.length() > maxLength){
                maxLength = numero.length();
            }
        }

        return maxLength;
    }

    public static void lNormalize(String arr[],char c){

        int maxLength = maxLength(arr);

        for (int i = 0; i < arr.length; i++){
            arr[i] = lpad(arr[i], maxLength, c);
        }

    }

}
