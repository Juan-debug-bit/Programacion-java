package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Alpha7 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int sum=0;
        System.out.print("Dime A: ");
        int a = tcl.nextInt();
        System.out.print("Dime B: ");
        int b = tcl.nextInt();
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        tcl.close();
    }
}
