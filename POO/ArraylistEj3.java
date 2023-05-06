package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEj3 {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        // Creamos lista de Arrays de precios de productos
        ArrayList<Double> precios = new ArrayList<Double>();

        // Preguntamos al user los precios a introducir
        System.out.println("introduce los precios que desees (Si deseas salir introduce un precio negativo(-)): ");

        // Creamos bucle para que se repita siempre y cuando el precio sea 0 o mayor que
        // 0
        while (true) {
            double precio = tcl.nextDouble();
            if (precio < 0) {
                break;
            } else {
                precios.add(precio);
            }
        }
        // Imprimimos por pantalla los precios
        System.out.println("Precios del producto x: " + precios.toString());

        // Creamos Lista de Arrays de precios de productos menor que 0
        ArrayList<Double> precioBarato = new ArrayList<Double>();
        // Creamos Lista de Arrays de precios de productos mayor que 0
        ArrayList<Double> preciosAlto = new ArrayList<Double>();
        
        for (double precio  : precios) {
            if (precio < 100) {
                precioBarato.add(precio);
            } else {
                preciosAlto.add(precio);
            }
        }
        precios.clear(); //Limpiamos la lista de Arrays: precios

        //Mostramos los precios por pantalla
        System.out.println("Precios economicos: " + precioBarato.toString());
        System.out.println("Precios economicos: " + preciosAlto.toString());
    }

}
