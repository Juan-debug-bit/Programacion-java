package SISTEMASOLAR;

public class Planeta extends Astro{

    private double distAlSol;

    public Planeta(String nombre, double masa, double tempMedia, double distAlSol) {
        super(nombre, masa, tempMedia);
        this.distAlSol = distAlSol;
    }

    public double getDistAlSol() {
        return distAlSol;
    }

    public void setDistAlSol(double distAlSol) {
        this.distAlSol = distAlSol;
    }

    
}
