package SISTEMASOLAR;

import java.util.ArrayList;

public class SistemaSolar {
    private String nombre;
    private ArrayList<Planeta> planetas = new ArrayList<>();

    public SistemaSolar(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean verPlaneta() {
        for (Planeta planeta : planetas) {
            System.out.println(planeta.toString());       
        }
        return true;
    }

    public void anyadirPlaneta(String nombre, double masa, double tempMedia, double distAlSol) {
        Planeta planeta = new Planeta(nombre, masa, tempMedia, distAlSol);
        planetas.add(planeta);
    }

    public void eliminarPlaneta(String nombre) {
        for (Planeta planeta : planetas) {
            if (planeta.getNombre().equalsIgnoreCase(nombre)) {
                planetas.remove(planeta);
            }
        }
    }

}
