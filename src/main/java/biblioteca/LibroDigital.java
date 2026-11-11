package biblioteca;

// SEGUNDA CLASE HIJA
public class LibroDigital extends Libro {

    private String urlDescarga;

    public LibroDigital(String codigo, String titulo,
                        String autor, String urlDescarga) {
        super(codigo, titulo, autor);
        this.urlDescarga = urlDescarga;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }
}

