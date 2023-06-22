public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() <3) {
            throw new Exception("ERROR: el nombre debe ser mayor a o igual a 3 caracteres");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("ERROR: La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("El gato se llama " + this.getNombre()+ " y tiene " + this.getEdad() + " años de edad");
    }
}
