package POO2;

public class Alumno extends Persona {
    protected String grupo;
    protected double notaMed;
    
    public Alumno(String nom, String ape, String fechaNacim, String grupo, double notaMed) {
        this.nombre = nom;
        this.apellidos = ape;
        this.fechaNacimiento = fechaNacim;
        this.grupo = grupo;
        this.notaMed = notaMed;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotaMed() {
        return notaMed;
    }

    public void setNotaMed(double notaMed) {
        this.notaMed = notaMed;
    }
    
    @Override
    public String getNombre() {
        System.out.println("Alumno: ");
        return super.getNombre();
    }
    @Override
    public String toString() {
        return "Alumno: (Nombre= " + nombre +", Apellidos= " + apellidos + ", Fecha de nacimiento= " + fechaNacimiento + ", Grupo= " + grupo + ", Nota media= " + notaMed + ")"; 
    }
}
