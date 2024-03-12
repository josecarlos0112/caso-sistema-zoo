package administracionRecursos;

import java.util.HashMap;
import java.util.Map;

// Clase para gestionar los alimentos del zoológico
public class GestorAlimentos {
    private Map<String, Integer> inventarioAlimentos;

    public GestorAlimentos() {
        this.inventarioAlimentos = new HashMap<>();
    }

    // Método para agregar alimentos al inventario
    public void agregarAlimento(String nombreAlimento, int cantidad) {
        if (inventarioAlimentos.containsKey(nombreAlimento)) {
            int stockActual = inventarioAlimentos.get(nombreAlimento);
            inventarioAlimentos.put(nombreAlimento, stockActual + cantidad);
        } else {
            inventarioAlimentos.put(nombreAlimento, cantidad);
        }
    }

    // Método para eliminar alimentos del inventario
    public void eliminarAlimento(String nombreAlimento, int cantidad) {
        if (inventarioAlimentos.containsKey(nombreAlimento)) {
            int stockActual = inventarioAlimentos.get(nombreAlimento);
            int nuevoStock = Math.max(stockActual - cantidad, 0);
            inventarioAlimentos.put(nombreAlimento, nuevoStock);
        }
    }

    // Método para obtener el stock de un alimento específico
    public int obtenerStock(String nombreAlimento) {
        return inventarioAlimentos.getOrDefault(nombreAlimento, 0);
    }
}
