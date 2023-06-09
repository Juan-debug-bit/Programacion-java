package SISTEMASOLAR;

import java.util.Scanner;

public class ProgramaSisSolar {
    static Scanner tcl = new Scanner(System.in);
    static SistemaSolar sistema = new SistemaSolar(null);

    public static void main(String[] args) {
        
        boolean salir = false;
        
        while (!salir) {
            System.out.println("Menú");
            System.out.println();
            System.out.println("1. Ver planetas");
            System.out.println("2. Agregar planeta");
            System.out.println("3. Eliminar planeta");
            System.out.println("4. Salir");
            System.out.println();
            int opcion;
            System.out.println("Escoge una opción:");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    sistema.verPlaneta();
                    break;
                case 2:
                    anyadir();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Opción invalida");
                    System.out.println();
                    break;
            }
        }
    }

    public static void anyadir() {
        System.out.println("Nuevo Planeta");
        System.out.println();
        tcl.nextLine();
        System.out.print("Introduce nombre del planeta: ");
        String nombre = tcl.nextLine();
        System.out.println();
        System.out.print("Introduce masa del planeta: ");
        double masa = tcl.nextDouble();
        System.out.println();
        System.out.print("Introduce temperatura media del planeta: ");
        double tempMedia = tcl.nextDouble();
        System.out.println();
        System.out.print("Introduce distancia al sol: ");
        double dist = tcl.nextDouble();

        sistema.anyadirPlaneta(nombre, masa, tempMedia, dist);
    }
    public static void eliminar() {
        tcl.nextLine();
        System.out.print("Introduce nombre del planeta que quieres eliminar: ");
        String nombre = tcl.nextLine();
        sistema.eliminarPlaneta(nombre);
    }
}
