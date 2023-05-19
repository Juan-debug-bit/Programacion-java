package POO2;

public class Profesor extends Persona {
    protected String especialidad;
    protected double salario;
    
    public Profesor(String nom, String ape, String fechaNacim, String especialidad, double salario) {
        this.nombre = nom;
        this.apellidos = ape;
        this.fechaNacimiento = fechaNacim;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getNombre() {
        System.out.println("Profesor: ");
        return super.getNombre();
    }

    @Override
    public String toString() {
        return "Profesor: (Nombre= " + nombre +", Apellidos= " + apellidos + ", Fecha de nacimiento= " + fechaNacimiento + ", Especialidad= " + especialidad + ", Salario= " + salario + ")"; 
    }
}
