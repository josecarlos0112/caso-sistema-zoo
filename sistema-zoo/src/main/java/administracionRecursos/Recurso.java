package administracionRecursos;

// Clase para representar un recurso genérico
public abstract class Recurso {
    protected String nombre;
    protected int cantidadDisponible;

    // Constructor
    public Recurso(String nombre, int cantidadDisponible) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Métodos abstractos
    public abstract void agregar(int cantidad);
    public abstract void usar(int cantidad);

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
