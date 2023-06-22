package ExamRecup;

import java.util.Arrays;
import java.util.Scanner;

public class Pregunta2 {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce N: ");
        int n = tcl.nextInt();
        int matrix[][] = new int[n][n];
        // creamos tablero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1 + (int) (Math.random() * 2);
            }
        }
        // rellenamos tablero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }

        int uno = 0;
        int dos = 0;
        // Comprobamos filas
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum == n)
                uno++;

            else if (sum == n * 2)
                dos++;
        }
        //Comprobamos columnas
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            if (sum == n)
            uno++;
            else if (sum == n*2)
            dos ++;
        }
        //Comprobamos diagonales
            int sumd1 = 0;
            int sumd2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumd1 += matrix[i][i];
            sumd2 += matrix[i][matrix.length-1-i];
        }
        if (sumd1 == n)
            uno++;
        else if (sumd1 == (2*n))
            dos++;
        if (sumd2 == n)
            uno++;
        else if (sumd2 == (2*n))
            dos++;

         // Ganador
        System.out.println("Uno: " + uno);
        System.out.println("Dos: " + dos);
        if (uno > 0 && dos == 0)
            System.out.println("UNO");
        else if (uno == 0 && dos > 0)
            System.out.println("DOS");
        else
            System.out.println("EMPATE");
    }
}
