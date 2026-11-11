package biblioteca;

import java.util.List;

public class Utilidades {

    // WILDCARD <?>: CUALQUIER TIPO
    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    // WILDCARD <? extends Number>
    public static double sumarNumeros(
            List<? extends Number> numeros) {

        double suma = 0;

        for (Number n : numeros) {
            suma += n.doubleValue();
        }

        return suma;
    }

    // METODO GENERICO CON COMPARABLE
    public static <T extends Comparable<T>>
    T mayor(T a, T b) {

        if (a.compareTo(b) >= 0) {
            return a;
        }

        return b;
    }
}

// EJEMPLOS:
// Utilidades.imprimirLista(List.of("A", "B"));
// Utilidades.sumarNumeros(List.of(10, 20, 30));
// Utilidades.mayor(8, 15);

