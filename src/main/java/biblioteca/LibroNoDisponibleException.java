package biblioteca;

// EXCEPCION PERSONALIZADA CHECKED
public class LibroNoDisponibleException extends Exception {

    public LibroNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}

