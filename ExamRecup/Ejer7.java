package ExamRecup;

public class Ejer7 {
    public static boolean verificaFecha(String s) {
        //ponemos s en formato fecha
        String d = s.substring(0, 2);
        String m = s.substring(3, 5);
        String a = s.substring(6, 9);

        int dia = Integer.parseInt(d);
        int mes = Integer.parseInt(m);
        int anyo = Integer.parseInt(a);

        if (dia>=0 && dia<=31 && mes>=0 && mes<=12) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String anyo = "12/14/2000";
        String anyo2 = "28/10/2010";

        //Fecha sin devolver si es valida o no
        System.out.println(anyo);
        System.out.println(anyo2);

        boolean resultado = verificaFecha(anyo);
        boolean resultado2 = verificaFecha(anyo2);

        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
