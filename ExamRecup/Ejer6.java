package ExamRecup;

import java.util.Arrays;

public class Ejer6 {
    public static void eliminar (int[]v, int pos) {
        int n = v.length;

        for (int i = pos; i < n-1; i++) {
            v[i] = v[i + 1];
        }
        v[n-1] = 0;
    }
    public static void main(String[] args) {
        int [] array = {1, 2 ,3 ,4, 5, 6};
        System.out.println(Arrays.toString(array));
        eliminar(array, 4);
        System.out.println(Arrays.toString(array));
    }
}
