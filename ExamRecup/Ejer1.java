package ExamRecup;

import java.util.Arrays;

public class Ejer1 {
    // Creamos funcion
    public static double mediana(int[] v) {
        Arrays.sort(v);
        int n = v.length;
        if (n % 2 == 0) {
            int med1 = v[n / 2 - 1];
            int med2 = v[n / 2];
            return (double) (med1 + med2) / 2.0;
        } else {
            return (double) v[n / 2];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 15, 25, 40, 3 };
        double med = mediana(arr);
        System.out.println("La mediana es: " + med);
    }

}
