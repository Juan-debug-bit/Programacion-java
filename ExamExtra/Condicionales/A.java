package ExamExtra.Condicionales;

import java.util.Scanner;

public class A {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce edad: ");
        int edad = tcl.nextInt();
        if (edad >= 100) {
            System.out.println("Centenario");
        }else{
            System.out.println("Te falta");
        }
    }
}
