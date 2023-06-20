package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Beta4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int notas;
        int sum = 1;
        int media = 0;
        int contNotas = 0;
        boolean terminar = false;
        while (!terminar) {
            System.out.println("Introduce nota: ");
            notas = tcl.nextInt();
            if (notas == -1) {
                terminar = true;
            }
            contNotas++;
            sum = notas + sum;
        }
        
        media = sum / (contNotas-1);

        System.out.println("La suma total de las notas es:" + sum);
        System.out.println("La nota media es: " + media);
        tcl.close();
    }
}
