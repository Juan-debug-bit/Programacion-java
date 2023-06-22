package Ejercicios_de_Herencia_y_abstractas.Ejercicios_A;

import java.util.ArrayList;

public class Instituto {
    public static void main(String[] args) {
        // Variables auxiliares
        Persona p1, p2, p3;
        // Creamos la lista de personas
        ArrayList<Persona> personas = new ArrayList<Persona>();
        // Creamos 3 objetos Persona y los añadimos a la lista
        p1 = new Persona("María", "García", "1/1/1980");
        p2 = new Persona("Morad", "Farouk", "2/2/1980");
        p3 = new Persona("Sarah", "Hans", "3/3/1980");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        // Creamos 3 objetos Profesor y los añadimos a la lista
        p1 = new Profesor("Lionel", "Tarazón", "4/4/1990", "Inf", 2000);
        p2 = new Profesor("Paco", "Ramis", "5/5/1990", "Inf", 2250);
        p3 = new Profesor("Emilio", "Javaloyas", "6/6/1990", "Inf", 2500);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        // Creamos 3 objetos Alumno y los añadimos a la lista
        p1 = new Alumno("Laura", "Bolinches", "7/7/2000", "SMR1", 6);
        p2 = new Alumno("Mark", "Dev", "8/8/2000", "ASIR1", 9);
        p3 = new Alumno("Elen", "Mika", "9/9/2000", "DAW2", 7);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }
}
