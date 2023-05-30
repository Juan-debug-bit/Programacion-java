package SISTEMASOLAR;

public abstract class Astro {
    private String nombre;
    private double masa;
    private double tempMedia;

    public Astro(String nombre, double masa, double tempMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.tempMedia = tempMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTempMedia() {
        return tempMedia;
    }

    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }

}
