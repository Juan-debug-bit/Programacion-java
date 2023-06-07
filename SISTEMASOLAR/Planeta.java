package SISTEMASOLAR;

import java.util.ArrayList;

public class Planeta extends Astro{

    private double distAlSol;
    private ArrayList<Satelite> satelites = new ArrayList<>();

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

    public void anyadirSatelite(String nombre, double masa, double tempMedia, double distAlPlaneta) {
            Satelite satelite = new Satelite(nombre, masa, tempMedia, distAlPlaneta);
            satelites.add(satelite);
        
    }
}
