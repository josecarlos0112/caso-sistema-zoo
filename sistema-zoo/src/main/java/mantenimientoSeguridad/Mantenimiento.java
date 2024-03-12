package mantenimientoSeguridad;

// Clase para representar el mantenimiento de instalaciones
public class Mantenimiento {
    private String tarea;
    private String estado;

    // Constructor
    public Mantenimiento(String tarea) {
        this.tarea = tarea;
        this.estado = "Pendiente";
    }

    // Método para marcar la tarea como completada
    public void completarTarea() {
        this.estado = "Completada";
        System.out.println("La tarea de mantenimiento de " + tarea + " ha sido completada.");
    }

    // Getters y setters
    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }
}
