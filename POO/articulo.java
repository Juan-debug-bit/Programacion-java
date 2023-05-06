package POO;

public class articulo {
    //ATRIBUTOS
    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;

    //CONSTRUCTOR
    public articulo(String nombre, double precio, int iva, int cuantosQuedan) {
        setNombre(nombre);
        setPrecio(precio);
        setIva(iva);
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <=0) {
            System.out.println("ERROR: El precio no puede ser negativo");
        }else{
            this.precio = precio;
        }
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public String toString()    {
        return ("nombre: " + nombre + " Precio: " + precio + " Cuantos: " + cuantosQuedan);
    }
}

