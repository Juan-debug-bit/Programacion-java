public class Entrenamiento {
public static void agotar(Corredor c) {
        try {
            while (true)
                c.correr();
        } catch (AgotadoException a) {
            System.out.println(a.getMessage());
        }

    }

    public static void main(String[] args) {
        Corredor paco = new Corredor(50);
        agotar(paco);
        paco.recargarEnergia(30);
        agotar(paco);
        paco.recargarEnergia(10);
        agotar(paco);
        System.out.println("Entrenamiento terminado");
    }
}
