package Ejercicios_de_Herencia_y_abstractas.Ejercicios_A;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;

    public Persona(String nombre, String apellidos, String fechaNacim) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNacim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + nombre + " " + apellidos + " " + fechaNacim;
    }

}
