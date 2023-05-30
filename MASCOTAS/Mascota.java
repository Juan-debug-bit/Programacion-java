package MASCOTAS;

public abstract class Mascota {
    // Atributos
    protected String nombre;
    protected int edad;

    // Constructor
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos abstractos
    public abstract String toString();

    public abstract void habla();

    public abstract void cumpleanyos();
}
