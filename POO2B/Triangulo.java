package POO2B;

public class Triangulo extends Figura {
    //variables
    protected double base;
    protected double altura;

    //Constructor
    public Triangulo(double a, double b) {
        this.base = b;
        this.altura = a;
    }

    public double getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public double area() {
        double area = (base * altura)/2;
        return area;
    }
}
