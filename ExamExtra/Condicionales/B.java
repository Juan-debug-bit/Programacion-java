package ExamExtra.Condicionales;

import java.util.Scanner;

public class B {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce edad");
        int edad = tcl.nextInt();

        if (edad < 0) {
            System.out.println("Imposible");
        }else{
            System.out.println("Estas vivo/a");
        }
    }
}
