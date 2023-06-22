package ExamRecup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pregunta1 {
    public static double media(int[] v) {
        int n = v.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += v[i];
        }
        return sum / n;
    }

    public static void insertar(int v[], int p, int x) {
        int n = v.length;
        for (int i = n - 1; i > p; i--) {
            v[i] = v[i - 1];
        }
        v[p] = x;
    }

    public static int[] secuencia(int a, int b) {
        int cuantos = b - a + 1;
        int v[] = new int[cuantos];
        for (int i = 0; i < cuantos; i++) {
            v[i] = a + i;
        }
        return v;
    }

    public static double totalTicket(double[] v) {
        double precioFinal = 0;
        int n = v.length;
        for (int i = 0; i < n; i += 2) {
            double cantidad = v[i];
            double precio = v[i + 1];
            double subtotal = cantidad * precio;
            precioFinal += subtotal;
        }
        return precioFinal;
    }

        public static boolean esCapicua(int[] v) {

        int i = 0;
        int j = v.length - 1;

        while (i < j) {
            if (v[i] != v[j]) {
                System.out.println("No es capicua");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("Es capicua");
        return true;
    }

    public static String getInciales (String s) {
        String iniciales = " ";
        s = s.replace(",", " ").replace(".", " ").toUpperCase();
        String []palabras = s.split(" ");
        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                char primeraLetra = palabra.charAt(0);
                iniciales += primeraLetra;
            }
        }
        return iniciales;
    }

    public static void main(String[] args) {
        int[] array = { 17, 5 };
        System.out.println(Arrays.toString(array));
        double sol = media(array);
        System.out.println("La media es: " + sol);

        int[] arrayInsert = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(arrayInsert));
        insertar(arrayInsert, 1, 10);
        System.out.println(Arrays.toString(arrayInsert));

        int[] arraySec = secuencia(7, 10);
        System.out.println(Arrays.toString(arraySec));

        double[] arrayTicket = { 1, 5.5, 2, 10 };
        System.out.println(Arrays.toString(arrayTicket));
        System.out.println(totalTicket(arrayTicket));
        
System.out.println("*** INICIO TESTS G");
        ArrayList<String> frases = new ArrayList();
        frases.add("Hola que tal");
        frases.add("Hola, que, tal");
        frases.add("Hola,que,tal");
        frases.add("Hola ,.que., tal");
        frases.add("Hola. , .,.que., .,, tal");
        frases.add("Pipipi");
        frases.add("    Pi pi pi pi ri pi pi xu    ");
        frases.add("Parece dificil, pero tú puedes. Venga");
        frases.add("");
        for(String palabra : frases){
            System.out.println(palabra + " => " + getInciales(palabra));
        }
        System.out.println("*** FIN TESTS G");

    }
}
