package administracionRecursos;

// Clase para representar una medicina
public class Medicina extends Recurso {
    private String tipo;

    // Constructor
    public Medicina(String nombre, int cantidadDisponible, String tipo) {
        super(nombre, cantidadDisponible);
        this.tipo = tipo;
    }

    // Implementación de métodos abstractos
    @Override
    public void agregar(int cantidad) {
        // Implementar lógica para agregar medicinas al inventario
    }

    @Override
    public void usar(int cantidad) {
        // Implementar lógica para usar medicinas
    }

    // Getters y setters específicos para medicinas
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
