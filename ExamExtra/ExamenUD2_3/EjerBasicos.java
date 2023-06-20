package ExamExtra.ExamenUD2_3;

import java.util.Scanner;

public class EjerBasicos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int horas = 0;
        System.out.println("Dime un número de horas");
        horas = tcl.nextInt();

        int dias= horas /24;
        int semanas = horas / 168;
        double dia =(horas % 168)/24;
        System.out.println(horas + " horas equivale a " + dias + " dias, tambien " + semanas + " semana + " + (int)dia + " días");
    tcl.close();
    }
}
