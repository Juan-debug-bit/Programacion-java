package ExamRecup;

public class Ejer7 {
    public static boolean verificaFecha(String s) {
        //ponemos s en formato fecha
        s = "00/00/0000";
        String d = s.substring(0, 2);
        String m = s.substring(3, 5);
        String a = s.substring(6, 9);

        int dia = Integer.parseInt(d);
        
        
        return true;
    }
    public static void main(String[] args) {
        String año = "00/00/0000";
        String d = año.substring(0, 2);
        System.out.println(d);
    }
}
