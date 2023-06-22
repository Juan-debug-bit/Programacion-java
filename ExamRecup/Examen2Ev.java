package ExamRecup;

import java.util.Arrays;
import java.util.Scanner;

public class Examen2Ev {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.print("PROGRAMATOR");
            System.out.println("------------");
            System.out.println("1. Media valores altos");
            System.out.println("2. cerimetro");
            System.out.println("3. Vocalimetro");
            System.out.println("4. SALIR");
            System.out.println();
            System.out.print("Introduce una opción: ");
            int opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    mediaValoresAltos();
                    break;
                case 2:

                    break;
                case 3:
                    vocalimetro();
                    break;
                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void vocalimetro() {
        Scanner tcl = new Scanner(System.in);
        int contadorMax = 0;
        int contadorAct = 0;
        int palabraMax = 0;
        String FraseOri = tcl.nextLine();
        String[] porPalabras = FraseOri.split((" "));
        for (int i = 0; i < porPalabras.length; i++) {
            char[] letras = porPalabras[i].toCharArray();
            char letra;
            for (int j = 0; j < letras.length; j++) {
                letra = letras[j];
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contadorAct++;
                }
            }
            if (contadorMax < contadorAct) {
                contadorMax = contadorAct;
                palabraMax = i;
            }
            contadorAct = 0;
        }
        System.out.println(porPalabras[palabraMax]);
    }

    public static void mediaValoresAltos() {
        Scanner tcl = new Scanner(System.in);
        int cuantos;
        System.out.print("Introduce el tamanyo en nº del array: ");
        cuantos = tcl.nextInt();
        int[] numeros = new int[cuantos];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("introduce número " + i + ": ");
            numeros[i] = tcl.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        
        Arrays.sort(numeros);
        int sum = numeros[numeros.length-1] + numeros[numeros.length-2] + numeros[numeros.length-3];
        double media = sum / 3.0;

        System.out.println("La media aritmética de los 3 valores más altos es: " + media);
    }
}
