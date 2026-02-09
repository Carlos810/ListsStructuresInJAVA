package TiposListas;

import java.util.*;

public class TiposListasDoc {
    /**
     * Método principal de la aplicación.
     */
    public  void PrintListsExamples() {

        // ============================================================================
        // === CREACIÓN DE UNA LISTA ==================================================
        // ============================================================================
        // List NO es una clase, es una interfaz
        // Define qué puede hacer la colección: add, remove, get, size
        List<String> nombres = new ArrayList<>();
        //List<String> OtraLista = new LinkedList<>();

        // Agregar elementos a la lista
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Lucía");

        System.out.println("Lista original: " + nombres);

        // ============================================================================
        // === ACCESO A ELEMENTOS =====================================================
        // ============================================================================
        String primero = nombres.get(0); // acceso por índice
        System.out.println("Primer elemento: " + primero);

        // ============================================================================
        // === DIFERENTES FORMAS DE ITERAR ============================================
        // ============================================================================
        System.out.println("\nIteración con for tradicional:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Índice " + i + ": " + nombres.get(i));
        }

        System.out.println("\nIteración con while:");
        int index = 0;
        while (index < nombres.size()) {
            System.out.println("Índice " + index + ": " + nombres.get(index));
            index++;
        }

        System.out.println("\nIteración con forEach (lambda):");
        nombres.forEach(nombre -> System.out.println(" - " + nombre));

        // ============================================================================
        // === BÚSQUEDA ===============================================================
        // ============================================================================
        System.out.println("\n¿La lista contiene a 'Ana'? " + nombres.contains("Ana"));

        // ============================================================================
        // === ORDENAMIENTO ============================================================
        // ============================================================================
        Collections.sort(nombres); // orden alfabético natural
        System.out.println("\nLista ordenada alfabéticamente: " + nombres);

        // Orden inverso con Comparator
        nombres.sort(Comparator.reverseOrder());
        System.out.println("Lista ordenada inversamente: " + nombres);

        // ============================================================================
        // === ELIMINACIÓN =============================================================
        // ============================================================================
        nombres.remove("Pedro"); // elimina por valor
        System.out.println("\nLista después de eliminar 'Pedro': " + nombres);

        // ============================================================================
        // === FILTRO CON STREAMS ======================================================
        // ============================================================================
        // Stream API funcional introducida en Java 8 , Devuelve un Stream<T>, no una colección
        System.out.println("\nNombres que empiezan con 'C':");
        nombres.stream()
                .filter(nombre -> nombre.startsWith("C"))
                .forEach(System.out::println);

        // ============================================================================
        // === LISTA INMUTABLE =========================================================
        // ============================================================================
        // Buena práctica cuando no queremos que la lista cambie más
        // Código más seguro en sistemas grandes
        // Concurrencia (multi-hilo) , No hay condiciones de carrera

        //Buen diseño de APIs cuando se devuelven datos
        //public List<String> obtenerNombres() {
        //    return List.copyOf(nombres);
        //}
        List<String> nombresInmutables = List.copyOf(nombres);
        System.out.println("\nLista inmutable: " + nombresInmutables);

    }
}
