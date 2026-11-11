package biblioteca;

// GENERICOS <T>
public class CajaGenerica<T> {

    private T elemento;

    public CajaGenerica(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }
}

// EJEMPLO DE USO:
// CajaGenerica<String> caja = new CajaGenerica<>("Hola");
// String texto = caja.getElemento();

