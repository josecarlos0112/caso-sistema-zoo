package gestionTrabajadores;

// Clase para representar a un cuidador del zoológico
public class Cuidador extends Trabajador {
    private String areaAsignada;

    // Constructor
    public Cuidador(String nombre, int edad, String departamento, String areaAsignada) {
        super(nombre, edad, departamento);
        this.areaAsignada = areaAsignada;
    }

    // Getter y setter específico para el área asignada
    public String getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }
}
