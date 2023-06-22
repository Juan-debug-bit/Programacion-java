import java.util.Scanner;

public class Matrix {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        int f, c;
        System.out.print("Introduce F: ");
        f = tcl.nextInt();
        System.out.print("Introduce C: ");
        c = tcl.nextInt();

        int [][] matriz = new int[f][c];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*(5-(-5)+1)+(-5));
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
        //Filas
        for (int i = 0; i < matriz.length; i++) {
            int sum=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
            System.out.println("Fila " + (i+1) + ": " + sum);
        }
        //Columnas
        for (int i = 0; i < matriz.length; i++) {
            int sum=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[j][i];
            }
            System.out.println("Columna " + (i+1) + ": " + sum);
        }
        //suma total
        int sumTotal=0;
        for (int i = 0; i < matriz.length; i++) {
            int sum=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
            sumTotal += sum;
        }
        System.out.println("Suma total: " + sumTotal);
    }
}
