package ExamExtra.ExamenUD2_3;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        double precio;
        double iva = 0.21;
        double sum= 0;
        double precioSinIva = 0;
        double precioTotal=0;

        System.out.println("Dime un precio(Marca 0 si quieres terminar) : ");
        do {
            precio=tcl.nextDouble();
            sum = precio+ sum;
        } while (precio != 0);
        System.out.println((int)sum);
        precioSinIva = sum*iva;
        System.out.println(precioSinIva);
        precioTotal =sum + precioSinIva;
        System.out.println(precioTotal);

    }
}
