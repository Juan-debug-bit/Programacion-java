package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Alpha8 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int mult = 1;
        for (int i = 1; i <= 10; i++) {
            mult = mult * i;
            System.out.println(mult);
        }
        
        tcl.close();
    }
}
