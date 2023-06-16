package ExamRecup;

import java.util.Scanner;

public class Examen2Ev {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.print("PROGRAMATOR");
            int opcion = tcl.nextInt();
            System.out.println("------------");
            System.out.println("1. Media valores altos");
            System.out.println("2. cerimetro");
            System.out.println("3. Vocalimetro");
            System.out.println("4. SALIR");

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void vocalimetro() {
        Scanner user = new Scanner(System.in);
        int contadorMax = 0;
        int contadorAct = 0;
        int palabraMax = 0;
        String FraseOri = user.nextLine();
        String[] porPalabras = FraseOri.split((" "));
        for (int i = 0; i < porPalabras.length; i++) {
            char[] letras = porPalabras[i].toCharArray();
            char letra;
            for (int j = 0; j < letras.length; j++) {
                letra = letras[j];
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contadorAct++;
                }
            }
            if (contadorMax < contadorAct) {
                contadorMax = contadorAct;
                palabraMax = i;
            }
            contadorAct = 0;
        }

        contadorMax = 0;
        contadorAct = 0;
        palabraMax = 0;
        FraseOri = user.nextLine();
        porPalabras = FraseOri.split((" "));
        for (int i = 0; i < porPalabras.length; i++) {
            char[] letras = porPalabras[i].toCharArray();
            char letra;
            for (int j = 0; j < letras.length; j++) {
                letra = letras[j];
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contadorAct++;
                }
            }
            if (contadorMax < contadorAct) {
                contadorMax = contadorAct;
                palabraMax = i;
            }
            contadorAct = 0;
        }
        System.out.println(porPalabras[palabraMax]);
    }
}
