package POO;

public class MainArticulos {
    public static void main(String[] args) {
        articulo a1 = new articulo("Gafas", 20.5, 21, 5);
        articulo a2 = new articulo("Zapatillas", 100.0, 21, 10);
        articulo a3 = new articulo("Camiseta", 25.0, 21, 25);
    
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}