package ExamRecup;

import java.util.Arrays;

public class Ejer3 {
    public static int[] impares(int[] v) {
        int n = v.length;
        int count = 0;
        
        // Contar la cantidad de elementos en posiciones impares
        for (int i = 1; i < n; i += 2) {
            count++;
        }
        
        // Crear un nuevo arreglo para almacenar los elementos en posiciones impares
        int[] impares = new int[count];
        
        // Copiar los elementos en posiciones impares al nuevo arreglo
        int index = 0;
        for (int i = 1; i < n; i += 2) {
            impares[index] = v[i];
            index++;
        }
        
        return impares;
    }
    
    public static void main(String[] args) {
        int[] v1 = {7, 1, 2, 10, 5};
        int[] impares1 = impares(v1);
        System.out.println("Los números en posiciones impares son: " + Arrays.toString(impares1));
        
        int[] v2 = {4};
        int[] impares2 = impares(v2);
        System.out.println("Los números en posiciones impares son: " + Arrays.toString(impares2));
    }
}


