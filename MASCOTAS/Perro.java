package MASCOTAS;

public class Perro extends Mascota {
    //Atributos
    private boolean pulgas = false;

    public Perro(String nombre, int edad, boolean pulgas) {
        super(nombre, edad);
        this.pulgas = pulgas;
    }

    public String toString() {
        return "[Nombre: " + nombre + ", Edad: " + edad + ", Pulgas: " + pulgas + "]";
    }

    public void habla() {
        System.out.println("Guau Guau");
    }

    public void cumpleanyos() {
        edad++;
    }
}
