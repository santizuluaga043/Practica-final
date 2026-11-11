package biblioteca;

// CLASE ABSTRACTA + ENCAPSULAMIENTO
public abstract class Libro {

    private String codigo;
    private String titulo;
    private String autor;

    // CONSTRUCTOR
    public Libro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    // GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // SETTER
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // METODO ABSTRACTO
    public abstract String getTipo();

    // SOBRESCRITURA DE toString
    @Override
    public String toString() {
        return codigo + " - " + titulo + " - " + autor
                + " (" + getTipo() + ")";
    }
}

