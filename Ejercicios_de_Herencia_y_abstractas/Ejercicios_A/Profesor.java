package Ejercicios_de_Herencia_y_abstractas.Ejercicios_A;

public class Profesor extends Persona {

    protected String especialidad;
    protected double salario;

    public Profesor(String nombre, String apellidos, String fechaNacim, String especialidad, double salario) {
        super(nombre, apellidos, fechaNacim);
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

    // Método getNombre de Profesor
    public String getNombre() {
        return "Profesor: " + nombre;
    }

    @Override
    public String toString() {
        return super.toString() + " " + especialidad + " " + salario;
    }

    
}
