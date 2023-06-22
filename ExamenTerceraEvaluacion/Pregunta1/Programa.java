package ExamenTerceraEvaluacion.Pregunta1;

import java.util.Scanner;

public class Programa {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("DNI: ");
                String dni = tcl.nextLine();
                if (dni.equals("-1")) {
                    break;
                } else {
                    System.out.print("Nombre: ");
                    String nombre = tcl.nextLine();

                    System.out.print("Día? ");
                    int dia = tcl.nextInt();
                    System.out.print("Mes? ");
                    int mes = tcl.nextInt();
                    System.out.print("Año? ");
                    int año = tcl.nextInt();
                    tcl.nextLine();

                    Carnet c1 = new Carnet(dni, nombre, dia, mes, año);
                    System.out.println(c1.toString());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                tcl.nextLine();
            }
        }
        
    }
}
