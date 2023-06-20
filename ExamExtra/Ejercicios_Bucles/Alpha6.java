package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Alpha6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        tcl.close();
    }
}
