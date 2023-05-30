package MASCOTAS;

import java.util.ArrayList;

public class ProgramaMascotas {
    public static void main(String[] args) {
    //Creamos arraylist de Mascota
        ArrayList <Mascota> mascotas = new ArrayList<>();

        // Esto genera un error al ser una clase abstracta
        // Mascota newmascota = new Mascota() {
        // };

        //Creamos las mascotas (2 de cada)
        Perro perro1 = new Perro("Mateo", 8, false);
        Perro perro2 = new Perro("Tara", 9, true);
        Gato gato1 = new Gato("Horus", 1, "Negro");
        Gato gato2 = new Gato("Venus", 1, "Negro");
        Canario canario1 = new Canario("Nix", 1, true);
        Canario canario2 = new Canario("caetano", 8, false);

        //Anyadimos las mascotas al Arraylist
        mascotas.add(perro1);
        mascotas.add(perro2);
        mascotas.add(gato1);
        mascotas.add(gato2);
        mascotas.add(canario1);
        mascotas.add(canario2);

        //creamos bluce para mostrarlas por pantalla
        System.out.println("Mascotas: ");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }

        //Hacemos que todas las mascotas cumplan anyos x5
        System.out.println();
        System.out.println("Mascotas con 5 anyos más: ");
        for (int i = 0; i < 5; i++) {
            for (Mascota mascota : mascotas) {
                mascota.cumpleanyos();
                System.out.println(mascota);
            }
        }

        //Hacemos  que las mascotas hablen
        System.out.println();
        System.out.println("\nHablando...");
        for (Mascota mascota : mascotas) {
            mascota.habla();
        }
    }
}
