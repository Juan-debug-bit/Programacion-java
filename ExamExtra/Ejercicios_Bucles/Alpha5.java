package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Alpha5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dime A: ");
        int a = tcl.nextInt();
        System.out.print("Dime B: ");
        int b = tcl.nextInt();
        if (a > b) {
            for (int i = a; i >= b; i -=2) {
                System.out.print(i + ", ");
            }
        }
        tcl.close();
    }

}
