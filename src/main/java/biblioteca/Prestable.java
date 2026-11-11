package biblioteca;

// INTERFAZ
public interface Prestable {

    boolean sePuedePrestar();

    void prestar() throws LibroNoDisponibleException;
}

