package biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventarioLibros inventario = new InventarioLibros();
        ServicioPrestamos servicio = new ServicioPrestamos(inventario);

        // CREACION DE OBJETOS
        LibroFisico libro1 = new LibroFisico(
                "001", "Java Basico", "Ana", 3);

        LibroFisico libro2 = new LibroFisico(
                "002", "POO", "Carlos", 1);

        LibroDigital libro3 = new LibroDigital(
                "003", "Algoritmos", "Maria", "www.libros.com");

        // POLIMORFISMO: todos son Libro
        inventario.agregarLibro(libro1);
        inventario.agregarLibro(libro2);
        inventario.agregarLibro(libro3);

        int opcion;

        // CICLO WHILE + SWITCH
        do {
            System.out.println("\n--- BIBLIOTECA ---");
            System.out.println("1. Mostrar libros");
            System.out.println("2. Prestar libro");
            System.out.println("3. Buscar por titulo");
            System.out.println("4. Ordenar por titulo");
            System.out.println("5. Mostrar disponibles");
            System.out.println("6. Contar libros fisicos");
            System.out.println("0. Salir");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    inventario.mostrarLibros();
                    break;

                case 2:
                    System.out.print("Codigo: ");
                    String codigo = sc.nextLine();
                    servicio.prestarLibro(codigo);
                    break;

                case 3:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    servicio.consultarTitulo(titulo);
                    break;

                case 4:
                    inventario.ordenarPorTitulo();
                    inventario.mostrarLibros();
                    break;

                case 5:
                    for (LibroFisico l :
                            inventario.librosFisicosDisponibles()) {
                        System.out.println(l);
                    }
                    break;

                case 6:
                    System.out.println(
                            inventario.contarLibrosFisicos());
                    break;

                case 0:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        sc.close();
    }
}

