package ArrayList_Practicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Precios {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> precios = new ArrayList<Double>();
        System.out.println("Introduce precio (Marca un precio negativo si quieres terminar): ");
        while (true) {
            double precio = tcl.nextDouble();
            if (precio < 0) {
                break;
            } else {
                precios.add(precio);
            }
        }
        System.out.println("Precios del producto x: " + precios.toString());

        ArrayList<Double> menosDe100 = new ArrayList<Double>();
        ArrayList<Double> masDe100 = new ArrayList<Double>();

        for (double precio : precios) {
            if (precio < 100) {
                menosDe100.add(precio);
            } else {
                masDe100.add(precio);
            }
        }

        System.out.println("Precios menores que 100: " + menosDe100.toString());
        System.out.println("Precios mayores que 100: " + masDe100.toString());
    }
}
