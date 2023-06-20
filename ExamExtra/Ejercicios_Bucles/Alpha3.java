package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Alpha3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dime A");
            int a = tcl.nextInt();
        System.out.println("Dime B");
            int b = tcl.nextInt();
                for (int i = a; i <= b; i+=2) {
                    System.out.println(i);
                }
        tcl.close();
    }
}
