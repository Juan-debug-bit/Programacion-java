package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Beta1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite un numero sobre el cual quieres saber la tabla de multiplicar: ");
        int n = tcl.nextInt();
        int mult = 1;
        for (int i = 1; i <= 10; i++) {
            mult = i * n;
            System.out.println("Tabla de multiplicar: " + n + " x " + i + ": " + mult);
        }
        tcl.close();
    }
}
