package ExamRecup;

import java.util.Arrays;

public class Ejer11 {
    public static void sudoku(int[][] sud) {
        // comprueba filas
        int[][] matrix = sud;
        boolean esSudoku = true;
        int suma = 0;
        // comprueba las columnas
        for (int columnas = 0; columnas < sud.length; columnas++) {
            for (int filas = 0; filas < sud.length; filas++) {
                if (matrix[columnas][filas] == 1 || matrix[columnas][filas] == 2 || matrix[columnas][filas] == 3) {
                    suma = suma + matrix[columnas][filas];
                } else {
                    esSudoku = false;
                    break;
                }
            }
            if (suma != 6) {
                esSudoku = false;
                break;
            }
            suma = 0;
        }
        // comprueba las filas
        for (int filas = 0; filas < sud.length; filas++) {
            for (int cols = 0; cols < sud.length; cols++) {
                if (matrix[filas][cols] == 1 || matrix[filas][cols] == 2 || matrix[filas][cols] == 3) {
                    suma = suma + matrix[filas][cols];
                } else {
                    esSudoku = false;
                    break;
                }
            }
            if (suma != 6) {
                esSudoku = false;
                break;
            }
            suma = 0;
        }
        if (esSudoku) {
            System.out.println("Es un sudoku");
        } else {
            System.out.println("No es sudoku");
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = new int[3][3];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = (int) (Math.random() * 3) + 1;
            }
        }
        System.out.println("Matriz de Sudoku:");
        for (int i = 0; i < sudoku.length; i++) {
            System.out.println(Arrays.toString(sudoku[i]));
        }
        sudoku(sudoku);
    }
}
