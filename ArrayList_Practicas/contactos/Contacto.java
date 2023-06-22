package ArrayList_Practicas.contactos;

public class Contacto {
    private String nombre;
    private int num;
    private String correo;

    public Contacto(String nombre, int num, String correo) {
        this.nombre = nombre;
        this.num = num;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", num=" + num + ", correo=" + correo + "]";
    }

}
