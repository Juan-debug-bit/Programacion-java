package POO;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ejercicio9 {
    static Scanner tcl = new Scanner(System.in);

public static void main(String[] args) {
    int A, B;

    try {
        System.out.print("Introduce entero 1: ");
        A = tcl.nextInt();
        System.out.print("Introduce entero 2: ");
        B = tcl.nextInt();
        int result = A/B;
        System.out.println("El resultado es: " + result);
    } 
    catch (InputMismatchException e) {
        System.out.println("Error!! El valor introducido es incorrecto ");
        e.printStackTrace();
    }
    catch (ArithmeticException e) {
        System.out.println("Error!! Los valores introducidos no pueden ser 0 ");
        e.printStackTrace();
    }
}
}
