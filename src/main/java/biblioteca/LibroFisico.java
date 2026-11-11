package biblioteca;

// HERENCIA + INTERFAZ
public class LibroFisico extends Libro implements Prestable {

    private int cantidadDisponible;

    // CONSTRUCTOR CON super()
    public LibroFisico(String codigo, String titulo,
                       String autor, int cantidadDisponible) {
        super(codigo, titulo, autor);
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    @Override
    public String getTipo() {
        return "Fisico";
    }

    @Override
    public boolean sePuedePrestar() {
        return cantidadDisponible > 0;
    }

    // EXCEPCIONES: throw + throws
    @Override
    public void prestar() throws LibroNoDisponibleException {

        if (!sePuedePrestar()) {
            throw new LibroNoDisponibleException(
                    "No hay unidades disponibles");
        }

        cantidadDisponible--;
        System.out.println("Prestamo realizado");
    }
}

