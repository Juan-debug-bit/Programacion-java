package ArrayList_Practicas.contactos;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactoMain {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        Contacto contacto1 = new Contacto("Juan", 678278897, "juaJimfra@gmail.com");
        Contacto contacto2 = new Contacto("Valeria", 661141480, "suval@gmail.com");
        Contacto contacto3 = new Contacto("Lio", 67898098, "Lio@gmail.com");
        Contacto contacto4 = new Contacto("Jose", 722787656, "jose@gmail.com");

        contactos.add(contacto1);
        contactos.add(contacto2);
        contactos.add(contacto3);
        contactos.add(contacto4);

        System.out.println(contactos.toString());
        System.out.println();
        System.out.println("Introduce nombre: ");
        String nombre = tcl.nextLine();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().toLowerCase().contains(nombre)) {
                System.out.println(contacto.toString());
            }
        }
    }
}
