package biblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class InventarioLibros {

    // ARRAYLIST
    private ArrayList<Libro> libros = new ArrayList<>();

    // HASHMAP: codigo -> libro
    private HashMap<String, Libro> librosPorCodigo = new HashMap<>();

    // AGREGAR ELEMENTOS
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        librosPorCodigo.put(libro.getCodigo(), libro);
    }

    // FOR-EACH
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    // BUSQUEDA CON HASHMAP
    public Libro buscarPorCodigo(String codigo) {
        return librosPorCodigo.get(codigo);
    }

    // STREAM + LAMBDA + FILTER + OPTIONAL
    public Optional<Libro> buscarPorTitulo(String titulo) {
        return libros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                .findFirst();
    }

    // STREAM + FILTER + COLLECT
    public List<LibroFisico> librosFisicosDisponibles() {
        return libros.stream()
                .filter(l -> l instanceof LibroFisico)
                .map(l -> (LibroFisico) l)
                .filter(LibroFisico::sePuedePrestar)
                .collect(Collectors.toList());
    }

    // COMPARATOR + SORT
    public void ordenarPorTitulo() {
        libros.sort(Comparator.comparing(Libro::getTitulo));
    }

    // COMPARATOR CON LAMBDA
    public void ordenarPorCodigo() {
        libros.sort((a, b) ->
                a.getCodigo().compareTo(b.getCodigo()));
    }

    // STREAM + COUNT
    public long contarLibrosFisicos() {
        return libros.stream()
                .filter(l -> l instanceof LibroFisico)
                .count();
    }

    // MAP: RECORRER CLAVES Y VALORES
    public void mostrarMapa() {
        for (Map.Entry<String, Libro> entrada
                : librosPorCodigo.entrySet()) {
            System.out.println(
                    entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

