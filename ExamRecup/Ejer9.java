package ExamRecup;

public class Ejer9 {

    public static void sumaDeFilas(int[][] m) {

        int sum= 0;
        for (int i = 0; i < m.length; i++) {//FILAS
            for (int j = 0; j < m.length; j++) {//COLUMNAS
                sum += m[i][j];
            System.out.print(m[i][j] + "; ");
            }
        System.out.print("suma de filas: " + sum);
        sum=0;
        System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][]matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()* (20 -1 + 1)+1);
            }
        }
        sumaDeFilas(matriz);
    }
}