package Ejercicios_de_Herencia_y_abstractas.Ejercicios_A;

public class Alumno extends Persona {
    protected String grupo;
    protected int notaMedia;

    public Alumno(String nombre, String apellidos, String fechaNacim, String grupo, int notaMedia) {
        super(nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Método getNombre de Alumno
    public String getNombre() {
        return "Alumno: " + nombre;
    }

    @Override
    public String toString() {
        return super.toString() + " " + grupo +" " + notaMedia;
    }
}
