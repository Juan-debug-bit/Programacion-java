package ExamExtra.ExamenUD2_3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dime un numero x: ");
        int x = tcl.nextInt();
        int mult=0;
        for (int i = 1; i <= 10; i++) {
            mult = i*x;
            System.out.println(mult);
        }
    tcl.close();
    }
}
