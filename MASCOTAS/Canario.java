package MASCOTAS;

public class Canario extends Mascota {

    boolean volando = false;

    public Canario(String nombre, int edad, boolean volando) {
        super(nombre, edad);
        this.volando = volando;
    }

    public boolean isVolando() {
        return volando;
    }

    public void setVolando(boolean volando) {
        this.volando = volando;
    }

    public String toString() {
        return "[Nombre: " + nombre + ", Edad: " + edad + ", vuela: " + volando + "]";
    }

    public void habla() {
        System.out.println("Pio Pio");
    }

    public void cumpleanyos () {
        edad = edad + 2;
    }
}
