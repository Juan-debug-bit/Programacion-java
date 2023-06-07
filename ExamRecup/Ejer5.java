package ExamRecup;

import java.util.Arrays;

public class Ejer5 {
    public static void invertir(int[]v) {
        //creamos n que guarda la longitud del vector
        int n = v.length;
        //creamos variable para trabajar con la mitad del vector
        int temp;
        //bucle for en el cual recorremos el vector y lo partimos a la mitad
        for (int i = 0; i < v.length / 2; i++) {
            //Guardamos en la variable el v recorrido por i
            temp = v[i];
            v[i] = v[n - i - 1];
            v[n - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        int [] array = {1,4,7,6,8,6,4,3};

        System.out.println("Array sin invertir: " + Arrays.toString(array));

        invertir(array);
        System.out.println("Array invertido: " + Arrays.toString(array));
    }
}
