package POO2B;

public class Rectangulo extends Figura {

    double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public double area() {
        return ancho * alto;
    }
}
