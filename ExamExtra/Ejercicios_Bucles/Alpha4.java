package ExamExtra.Ejercicios_Bucles;

import java.util.Scanner;

public class Alpha4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        boolean terminar = false;
            while (!terminar) {
                System.out.println("Dime A");
                    int a = tcl.nextInt();
                System.out.println("Dime B");
                    int b = tcl.nextInt();
                        if (a < b) {
                            for (int i = b; i >= a; i--) {
                            System.out.println(i);
                            terminar = true;
                        }
                        
                            }else{
                                System.out.println("A es mayor que B, no es posible. Vuelve a intentarlo");
                                terminar = false;
                            }
            }
            
        tcl.close();
    }
}
