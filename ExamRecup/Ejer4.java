package ExamRecup;

import java.util.Arrays;

public class Ejer4 {
    public static int[] vectorRango(int[] v, int min, int max) {
        // Creamos contador para el rango del array
        int cont = 0;
        // Bucle for que recorre el array en el rango minimo y maximo
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= min && v[i] <= max) {
                cont++;
            }
        }
        // Creamos nuevo array para almacenarlo
        int indice = 0;
        int[] rango = new int[cont];
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= min && v[i] <=max) {
                rango[indice] = v[i];
                indice ++;
            }
        }
        return rango;
    }

    public static void main(String[] args) {
        // Creamos array para probarlo
        int[] array = { 1, 5, 7, 9, 11 };
        int[] rango = vectorRango(array, 2, 10);
        System.out.println("El rango de vectores es: " + Arrays.toString(rango));
    }
}
