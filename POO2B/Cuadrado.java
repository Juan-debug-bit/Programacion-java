package POO2B;

public class Cuadrado extends Figura {

    protected double lado;

    public Cuadrado(double l) {
        this.lado = l;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + "]";
    }

    @Override
    public double Area() {
        double area = lado * lado;
        return area;
    }
}
