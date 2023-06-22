package ArrayList_Practicas;

import java.util.ArrayList;

public class Colores {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();

        // Anyadimos colores
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");
        imprimeAl(colores);

        colores.add("Negro");
        colores.add("Cyan");
        imprimeAl(colores);
    
        colores.add(1, "Amarillo");
        colores.add(2, "Magenta");
        imprimeAl(colores);

        colores.remove(3);
        colores.remove(4);
        imprimeAl(colores);
    }

    public static void imprimeAl(ArrayList<String> al) {
        System.out.println("LISTA");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Pos " + (i+1) + " " + al.get(i));
        }
    }
}
