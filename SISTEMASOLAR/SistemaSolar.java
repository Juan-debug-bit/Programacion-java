package SISTEMASOLAR;

import java.util.ArrayList;

public class SistemaSolar {
    private String nombre;
    private ArrayList <Planeta> planetas = new ArrayList<>();
    
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
        for (int index = 0; index < planetas.size(); index++) {
            System.out.println("Planeta: " + (index+1) + ": ");
            System.out.println(planetas.get(index));
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
