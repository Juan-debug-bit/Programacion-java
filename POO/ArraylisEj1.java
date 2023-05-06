package POO;

import java.util.ArrayList;

public class ArraylisEj1 {
    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");
        imprimirAL(colores);

        colores.add("Negro");
        colores.add("Cyan");
        imprimirAL(colores);

        colores.add(1, "Amarillo");
        colores.add(2, "Magenta");
        imprimirAL(colores);

        colores.remove(3);
        colores.remove(4);
        imprimirAL(colores);
    }

    public static void imprimirAL(ArrayList<String> al) {
        System.out.println("LISTA");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Pos: " + i + " Item: " + al.get(i));
        }
    }
}
