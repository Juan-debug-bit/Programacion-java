package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactoMain {
    //Creamos Scanner
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
         //Creamos las dos Listas de Arrays
    ArrayList <Contacto> agenda = new ArrayList<Contacto>();

    //Creamos los cuatro objetos
    Contacto contacto1 = new Contacto("Juan Pablo", "655493920", "juan@gmail.com");
    Contacto contacto2 = new Contacto("Valeria", "621403443","vale@gmail.com");
    Contacto contacto3 = new Contacto("Lio","650403050","lio@hotmail.com");
    Contacto contacto4 = new Contacto("Josefa", "630202020", "josega@outlook.com");

    //Los insertamos dentro del ArrayList
    agenda.add(contacto1);
    agenda.add(contacto2);
    agenda.add(contacto3);
    agenda.add(contacto4);

    //Los imprimimos por pantalla para comprobar que funcionen
    System.out.println(contacto1.toString());
    System.out.println(contacto2.toString());
    System.out.println(contacto3.toString());
    System.out.println(contacto4.toString());
    
    //Preguntamos al usuario por un contacto
    System.out.print("Introduce el nombre del contacto que quieras buscar: ");
    String nombre = tcl.nextLine();
    for (Contacto contacto : agenda) {
        if (contacto.getNombre().toLowerCase().contains(nombre)) {
            System.out.println(contacto.toString());
        }
    }
    }
}
