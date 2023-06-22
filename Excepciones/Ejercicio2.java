

public class Ejercicio2 {
    public static void enviarMensaje(String correo) throws Exception {
        int longitud = correo.length();
        int arroba = correo.indexOf("@");
        int punto = correo.indexOf(".");

        if (arroba < punto - 1 && punto < longitud - 1 && arroba != -1 && punto != -1) {
            System.out.println("Correo valido" + correo);
        } else {
            if (longitud == 0) {
                throw new Exception("El email " + correo + " debe tener uno o más caracteres");
            }
            if (arroba == -1) {
                throw new Exception("El email " + correo + " debe tener una @");
            }
            if (punto == -1) {
                throw new Exception("El email " + correo + "  debe tener un . para indicar el dominio");
            }
            if (arroba >= longitud - 1) {
                throw new Exception("El email " + correo + " La @ debe contener carácteres después");
            }
            if (punto >= longitud - 1) {
                throw new Exception("El email " + correo + " El . debe contener carácteres después");
            }
            if (arroba >= punto - 1) {
                throw new Exception("El email " + correo + " La @ debe estar antés del . con algun caracter intermedio");
            }
        }
    }
    // Probando varias direcciones de correo.
    // Comentar líneas que lanzan excepción para comprobarlas todas
    public static void main(String[] args) {
        try {
            enviarMensaje("lionel@gmail.com");
            enviarMensaje("lionelgmail.com");
            enviarMensaje("lionel@gmailcom");
            enviarMensaje("lionel.gmail@com");
            enviarMensaje("lionel@gmailcom.");
            enviarMensaje("");
            enviarMensaje("lionel@.hola");
            enviarMensaje("lionel@hola.");
            enviarMensaje(null);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
