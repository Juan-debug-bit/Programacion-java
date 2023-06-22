package ExamExtra.UD5Ejercicios;

import java.util.Scanner;

public class Padawan1 {
    public static double multiplica (double a, double b) {
        return a * b;
    }
public static boolean esMayorEdad(int a) {
    if (a >= 18) {
        System.out.println("Es mayor de edad");
        return true;
    }
    System.out.println("Es menor de edad");
    return false;
}
public static int minimo(int a, int b) {
    if (a > b) {
        System.out.print("El menor es: ");
        return b;
    } else {
        System.out.print("El menor es: ");
        return a;
    }
}
public static int dimeSigno(int a) {
    if (a < 0) {
        return -1;
    }
    if (a == 0) {
            return 0;
    }
    if (a > 0) {
        return 1;
    }
    return a;
}
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("introduce a: ");
        double a = tcl.nextDouble();
        System.out.print("Introduce b: ");
        double b = tcl.nextDouble();
        double result = multiplica(a, b);
        System.out.println("El resultado de multiplicar es: " + result);

        System.out.print("Introduce edad: ");
        int c = tcl.nextInt();
        boolean resultado = esMayorEdad(c);
        System.out.println(resultado);

        System.out.print("Introduce num1: ");
        int num1 = tcl.nextInt();
        System.out.print("Introduce num2: ");
        int num2 = tcl.nextInt();

        int resultMinimo = minimo(num1, num2);
        System.out.println(resultMinimo);

        System.out.print("Introduce un entero: ");
        int entero = tcl.nextInt();
        System.out.println("Es: " + dimeSigno(entero));
    }
}
