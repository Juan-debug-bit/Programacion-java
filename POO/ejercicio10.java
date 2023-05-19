package POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio10 {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        double numeros[] = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println("Introduce el valor de la posición " + i);
                numeros[i] = tcl.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido es incorrecto");
                e.printStackTrace();
            }
        }
    }

    public static void imprimir(double []v) {
        System.out.print("Datos del vector [ ");

        for(int j = 0; j < v.length; j++)
        {
            System.out.print(v[j] + ", ");
        }

        System.out.println("\b\b ]"); 
    }
    
}
