package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Beta5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dime A: ");
        int a = tcl.nextInt();
        int contImpar = 0;
        int contPar = 0;
        System.out.print("Dime B: ");
        int b = tcl.nextInt();
        tcl.close();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                contPar++;
            }else{
                contImpar++;
            }
        }
        System.out.println("El total de pares es: " + contPar);
        System.out.println("El total de impares es: " + contImpar);

    }
}
