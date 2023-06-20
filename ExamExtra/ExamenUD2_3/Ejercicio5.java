package ExamExtra.ExamenUD2_3;

import java.util.Scanner;

public class Ejercicio5 {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        int h = 13, m = 25, s = 55, x = 10;

        for (int i = 0; i < x; i++) {
            s++;
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0;
                    }
                }
            }
        System.out.println( h +":" + m +":" + s );
        }
        
    }
}
