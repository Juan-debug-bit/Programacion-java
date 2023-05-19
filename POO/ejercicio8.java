package POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio8 {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        //pedimos numero entero
        int entero;

        try {
            System.out.print("Introduce un número entero: ");
            entero= tcl.nextInt();
            System.out.println("Valor introducido: " + entero);
        } catch (InputMismatchException e) {
            System.out.println("valor introducido erroneo");
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
}
