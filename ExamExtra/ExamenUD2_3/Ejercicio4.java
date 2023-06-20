package ExamExtra.ExamenUD2_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int x = tcl.nextInt();

        Random random = new Random();
        int cara = 0;
        int cruz = 0;            
        System.out.print("MONEDAS: ");
        for (int i = 0; i < x; i++) {
            
            if (random.nextBoolean()) {
                System.out.print("O ");
                cara++;
            } else {
                System.out.print("+ ");
                cruz++;
            }
        }

        System.out.println("\nCara O: " + cara + " monedas");
        System.out.println("Cruz +: " + cruz + " monedas");
    
        
        tcl.close();
    }
}

