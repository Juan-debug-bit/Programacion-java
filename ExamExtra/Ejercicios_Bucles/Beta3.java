package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Beta3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        int contPos =0;
        int contNeg =0;
        int sumPos = 0;
        int sumNeg = 0;
        boolean terminar = false;
        System.out.println("Introduce varios números (Si quieres terminar introduce 0):");
        while (!terminar) {
            num = tcl.nextInt();
            if (num == 0) {
                terminar = true;
            }
            if (num > 0) {
                sumPos = contPos +=1;
            } if (num < 0) {
                sumNeg = contNeg+=1;
            }
        }
        System.out.println("El total de los positivos es: " + sumPos);
        System.out.println("El total de los negativos es: " + sumNeg);

        tcl.close();
    }
}
