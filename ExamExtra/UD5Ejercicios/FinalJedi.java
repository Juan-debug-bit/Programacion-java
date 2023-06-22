package ExamExtra.UD5Ejercicios;

import java.util.Scanner;

public class FinalJedi {
    static Scanner tcl = new Scanner(System.in);

    public static int menu() {

        System.out.println("________________________");
        System.out.println("MENU");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas las soluciones");
        System.out.println("5. Salir");
        System.out.println("________________________");
        System.out.print("Introduce una opción: ");
        return tcl.nextInt();

    }

    public static double pideRadio() {
        System.out.print("Introduce el radio en cm: ");
        return tcl.nextDouble();
    }

    public static double circunferencia(double r) {
        return r * Math.PI;
    }

    public static double area(double r) {
        return r * r * Math.PI;
    }

    public static double volumen(double r) {
        return r * r * r * Math.PI * 4 / 3;
    }

    public static void main(String[] args) {
        int opcion;
        double radio;
        boolean salir = false;
        while (!salir) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    radio = pideRadio();
                    System.out.println("Circunferencia: " + circunferencia(radio));
                    break;
                case 2:
                    radio = pideRadio();
                    System.out.println("Área: " + area(radio));
                    break;
                case 3:
                    radio = pideRadio();
                    System.out.println("Volumen: " + volumen(radio));
                    break;
                case 4:
                    radio = pideRadio();
                    System.out.println("Circunferencia: " + circunferencia(radio));
                    System.out.println("Área: " + area(radio));
                    System.out.println("Volumen: " + volumen(radio));
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción invalida / vuelve a intentarlo");
                    break;
            }
        }
    }
}
