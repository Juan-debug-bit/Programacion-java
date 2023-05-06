package POO;

public class Contacto {
    // Atributos
    private String nombre;
    private String numero;
    private String correo;

    //Constructor
    public Contacto(String nombre, String numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Método toString para imprimir por pantalla
    public String toString() {
        return "Contacto [nombre=" + nombre + ", numero=" + numero + ", correo=" + correo + "]";
    }
}

