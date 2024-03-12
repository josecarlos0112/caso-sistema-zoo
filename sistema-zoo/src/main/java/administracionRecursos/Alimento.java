package administracionRecursos;

// Clase para representar un alimento
public class Alimento extends Recurso {
    private String tipo;

    // Constructor
    public Alimento(String nombre, int cantidadDisponible, String tipo) {
        super(nombre, cantidadDisponible);
        this.tipo = tipo;
    }

    // Implementación de métodos abstractos
    @Override
    public void agregar(int cantidad) {
        // Implementar lógica para agregar alimentos al inventario
    }

    @Override
    public void usar(int cantidad) {
        // Implementar lógica para usar alimentos
    }

    // Getters y setters específicos para alimentos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
