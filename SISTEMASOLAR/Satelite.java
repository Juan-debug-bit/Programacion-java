package SISTEMASOLAR;

public class Satelite extends Astro{

    private double distAlPlaneta;

    public Satelite(String nombre, double masa, double tempMedia, double distAlPlaneta) {
        super(nombre, masa, tempMedia);
        this.distAlPlaneta = distAlPlaneta;
    }

    public double getDistAlPlaneta() {
        return distAlPlaneta;
    }

    public void setDistAlPlaneta(double distAlPlaneta) {
        this.distAlPlaneta = distAlPlaneta;
    }
}