package POO2B;

public class Circulo extends Figura {
    //Variables
    protected double radio;

    //Constructor
    public Circulo(double r) {
        this.radio = r;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
    
    @Override
    public double Area() {
        double area = Math.PI*radio;
        return area;
    }
}
