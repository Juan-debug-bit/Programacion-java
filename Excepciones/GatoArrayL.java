import java.util.ArrayList;
import java.util.Scanner;

public class GatoArrayL {
        static    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Creamos el ArrayList de tipo Gato
        ArrayList<Gato> listaGatos = new ArrayList <Gato>();

        String nombre = "";
        int edad = 0;

        do {
            try {
                // Pedimos por teclado el nombre y la edad del gato
                System.out.println("Introduce los datos del gato " + listaGatos.size());
                System.out.print("Nombre: ");
                nombre = in.nextLine();
                System.out.print("Edad: ");
                edad = in.nextInt();
                in.nextLine();

                // Creamos el objeto Gato
                Gato g = new Gato(nombre, edad);

                // Añadimos el objeto Gato al ArrayList
                listaGatos.add(g);

            } catch (Exception e) {
                System.err.println(e);
                in.nextLine();
            }

        } while (listaGatos.size() < 5);

        // Imprime por pantalla la información de todos los gatos de la lista
        for (int i = 0; i < listaGatos.size(); i++) {
            System.out.print("GATO " + i + ": ");
            listaGatos.get(i).imprimir();
        }
    }
}
    
        
