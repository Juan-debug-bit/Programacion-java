package ExamRecup;

public class Ejer8 {
    public static String generaCodigo(String s) {
        //Creamos contador para las letras
        String codigo = "";
        String[] palabras = s.split(" ");
        for (String palabra : palabras) {
            if (palabra.length()>0) {
                char primeraLetra = palabra.charAt(0);
                int longitud = palabra.length();

            codigo += primeraLetra +""+ longitud + "";
                
            }
            
        }
        return codigo;

    }
    public static void main(String[] args) {

        String mostrar = "Hola como estas";
        System.out.println(mostrar);
        String codigoGenerado = generaCodigo(mostrar);
        System.out.println(codigoGenerado);
    }
}

