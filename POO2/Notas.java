package POO2;

import java.util.ArrayList;

public class Notas {
    public static void main(String[] args) {
        
        ArrayList <Persona> personas = new ArrayList<>();

        Persona p1 = new Persona("Juan Pablo", "Jimenez Franco", "08/08/00");
        Persona p2 = new Persona("Jorge", "Sierra Garcia", "24/01/04");
        Persona p3 = new Persona("Lluc", "Fort Crespo","09/07/02");

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        p1 = new Profesor("Lionel", "tarazon", "20/03/88", "Programacion", 3000);
        p2 = new Profesor("Raul", "ñengo Flow", "27/09/88", "Sistemas informáticos", 3000);
        p3 = new Profesor("Sergio", "Badal", "22/02/90", "Entornos de desarrollo", 3000);
    
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        p1 = new Alumno("Pablo", "Cabrera Cremades", "20/01/04", "1ºDAM", 7);
        p2 = new Alumno("Raul", "Olmedo Tamarit", "09/02/05", "1ºDAW", 7);
        p3 = new Alumno("Hugo", "Costa", "06/06/02", "1ºASIR", 7);
    
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
}
