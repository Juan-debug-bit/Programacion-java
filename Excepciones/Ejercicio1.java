import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El valor tiene que  ser positivo");
        }

        System.out.println("El numero positivo es: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("El valor tiene que ser negativo");
        }
        System.out.println("El numero negativo es: " + n);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Introduce un entero positivo: ");
                num = in.nextInt();
                imprimePositivo(num);

                System.out.print("Introduce un entero negativo: ");
                num = in.nextInt();
                imprimeNegativo(num);
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
