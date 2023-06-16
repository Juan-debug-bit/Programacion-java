package ExamRecup;

import java.util.Arrays;

public class Ejer5 {
    public static int [] invertir(int[]v) {

        int j=(v.length-1);
        int [] numInvertidos = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            numInvertidos[i] = v[j];
            j--;
        }
        return numInvertidos;
    }
    public static void main(String[] args) {
        int [] array = {1,4,7,6,8,6,4,3};

        System.out.println("Array sin invertir: " + Arrays.toString(array));

        int [] arrayInvertido = invertir(array);
        System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));
    }
}
