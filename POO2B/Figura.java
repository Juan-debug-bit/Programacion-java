package POO2B;

import java.util.ArrayList;

public abstract class Figura {
    //Constructor
    public Figura() {
    }
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Circulo(10)); // Radio=10
        figuras.add(new Cuadrado(10)); // Lado=10
        figuras.add(new Triangulo(10, 5)); // Base=10, Altura=5;
        figuras.add(new Rectangulo(5,10)); //ancho=5, alto=10;
        for (Figura f : figuras)
            System.out.println("Área: " + f.area());
    }
    public abstract double area();
}
