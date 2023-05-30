package MASCOTAS;

public class Gato extends Mascota{
    //Atributos
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }


    public String toString() {
        return "[Nombre: " + nombre + ", Edad: " + edad + ", Color: " + color + "]";
    }

    public void habla() {
        System.out.println("Miau Miau");
    }

    @Override
    public void cumpleanyos() {
        edad++;
    }
}
