package biblioteca;

public class ServicioPrestamos {

    private InventarioLibros inventario;

    // CONSTRUCTOR CON DEPENDENCIA
    public ServicioPrestamos(InventarioLibros inventario) {
        this.inventario = inventario;
    }

    // METODO CON TRY-CATCH
    public void prestarLibro(String codigo) {

        Libro libro = inventario.buscarPorCodigo(codigo);

        if (libro == null) {
            System.out.println("Libro no encontrado");
            return;
        }

        // INSTANCEOF
        if (libro instanceof Prestable) {

            try {
                Prestable prestable = (Prestable) libro;
                prestable.prestar();

            } catch (LibroNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else {
            System.out.println("Este libro no se presta fisicamente");
        }
    }

    // USO DE OPTIONAL
    public void consultarTitulo(String titulo) {
        inventario.buscarPorTitulo(titulo)
                .ifPresentOrElse(
                        libro -> System.out.println(libro),
                        () -> System.out.println("No encontrado")
                );
    }
}

