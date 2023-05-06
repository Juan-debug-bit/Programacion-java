package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEj2 {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> notas = new ArrayList<Integer>();

        // Pedir notas al usuario
        System.out.println("Introduce las notas del alumno (introduce -1 para salir): ");
        while (true) {
            int nota = tcl.nextInt();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }

        // Mostrar información de las notas
        System.out.println("Notas del alumno: " + notas.toString());
        int aprobados = 0, suspendidos = 0, ceros = 0, dieces = 0, suma = 0;
        double media = 0.0;
        for (int nota : notas) {
            suma += nota;
            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
            if (nota == 0) {
                ceros++;
            }
            if (nota == 10) {
                dieces++;
            }
        }
        if (notas.size() > 0) {
            media = suma / (double) notas.size();
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);
        System.out.println("Notas de cero: " + ceros);
        System.out.println("Notas de diez: " + dieces);
        System.out.println("Nota media: " + media);

        tcl.close();
    }
}
