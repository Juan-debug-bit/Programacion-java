package ExamRecup;
import java.util.Arrays;

public class Ejer2 {
    public static boolean iguales(int[] a, int[] b) {
        // Verificar si los arreglos tienen la misma longitud
        if (a.length != b.length) {
            return false;
        }
        
        // Ordenar los arrays
        Arrays.sort(a);
        Arrays.sort(b);
        
        // Comparar elemento por elemento
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {1, 2, 2, 3};
        
        System.out.println(iguales(a, b));  // true
        System.out.println(iguales(a, c));  // false
    }
}
