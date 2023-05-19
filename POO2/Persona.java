package POO2;

public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected String fechaNacimiento;

    public Persona(){
    }

    public Persona(String nom, String ape, String fechaNacim) {
        this.nombre = nom;
        this.apellidos = ape;
        this.fechaNacimiento = fechaNacim;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString() {
        return "(nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ")";
    }
}
