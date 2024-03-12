package gestionTrabajadores;

// Clase para representar a un veterinario del zoológico
public class Veterinario extends Trabajador {
    private String especialidad;

    // Constructor
    public Veterinario(String nombre, int edad, String departamento, String especialidad) {
        super(nombre, edad, departamento);
        this.especialidad = especialidad;
    }

    // Getter y setter específico para la especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
