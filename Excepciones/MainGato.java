public class MainGato {
    public static void main(String[] args) {

        try {
            Gato g1 = new Gato("Cati", 5);
            Gato g2 = new Gato("Miau", 3);
            Gato g3 = new Gato("Milú", 2);

            System.out.println("GATOS:");
            g1.imprimir();
            g2.imprimir();
            g3.imprimir();

            g1.setNombre("Gaton");
            g1.setEdad(10);
            g2.setNombre("ey");
            g2.setEdad(-3);

            System.out.println("GATOS:");
            g1.imprimir();
            g2.imprimir();
            g3.imprimir();
        

        } catch (Exception e) {
            System.err.println(e);
    }
    System.out.println("Finalizamos programa");
}
}
