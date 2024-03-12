package gestionTrabajadores;

// Clase para representar a un guardia de seguridad del zoológico
public class Guardia extends Trabajador {
    private String turno;

    // Constructor
    public Guardia(String nombre, int edad, String departamento, String turno) {
        super(nombre, edad, departamento);
        this.turno = turno;
    }

    // Getter y setter específico para el turno
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
