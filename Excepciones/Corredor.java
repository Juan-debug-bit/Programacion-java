public class Corredor {
    private int energia;

    public Corredor(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void recargarEnergia(int cantidad) {
        energia +=cantidad;
    }

    public void correr() throws AgotadoException {
        if (energia >= 10) {
            energia -= 10;
            System.out.println("Energia: " + energia);
        }else{
            AgotadoException x = new AgotadoException("Sin energía....  Plof!");
            throw x;
        }
    }
    public static void main(String[] args) {
        //Creo corredor con una energia de 25
        Corredor pepe = new Corredor(25);
        System.out.println("Energia: " + pepe.energia);
        //Recargo energia en 5 y muestro por pantalla
        pepe.recargarEnergia(5);
        System.out.println("Energia: " + pepe.energia);
        //Corro hasta que se queda sin energia para comprobar que la excepción salta correctamente
        try {
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
        } catch (AgotadoException a) {
            System.err.println(a.getMessage());
        }
    }
}
