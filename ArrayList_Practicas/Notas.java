package ArrayList_Practicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();

        System.out.println("Introduce las notas (para salir marque -1): ");
        while (true) {
            int nota;
            nota = tcl.nextInt();
            if (nota == -1) {
                break;
            } else {
                notas.add(nota);
            }
        }
        int aprobados = 0, suspendidos = 0, ceros = 0, dieces = 0, sum = 0;
        double media;
        for (Integer nota : notas) {
            sum += nota;
            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
            if (nota == 10) {
                dieces++;
            }
            if (nota == 0) {
                ceros++;
            }
        }
        media = sum/notas.size();
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);
        System.out.println("Dieces: " + dieces);
        System.out.println("Ceros: " + ceros);
        System.out.println("Media: " + media);

    }
}
