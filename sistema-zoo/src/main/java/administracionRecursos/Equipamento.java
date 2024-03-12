package administracionRecursos;

// Clase para representar un equipamiento
public class Equipamento extends Recurso {
    private String categoria;

    // Constructor
    public Equipamento(String nombre, int cantidadDisponible, String categoria) {
        super(nombre, cantidadDisponible);
        this.categoria = categoria;
    }

    // Implementación de métodos abstractos
    @Override
    public void agregar(int cantidad) {
        // Implementar lógica para agregar equipamiento al inventario
    }

    @Override
    public void usar(int cantidad) {
        // Implementar lógica para usar equipamiento
    }

    // Getters y setters específicos para equipamiento
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
