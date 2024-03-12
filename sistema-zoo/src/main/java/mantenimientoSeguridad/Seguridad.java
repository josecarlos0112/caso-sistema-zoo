package mantenimientoSeguridad;

// Clase para representar la seguridad del zoológico
public class Seguridad {
    private boolean sistemaActivado;

    // Constructor
    public Seguridad() {
        this.sistemaActivado = false;
    }

    // Método para activar el sistema de seguridad
    public void activarSistema() {
        this.sistemaActivado = true;
        System.out.println("El sistema de seguridad ha sido activado.");
    }

    // Método para desactivar el sistema de seguridad
    public void desactivarSistema() {
        this.sistemaActivado = false;
        System.out.println("El sistema de seguridad ha sido desactivado.");
    }

    // Getters y setters
    public boolean isSistemaActivado() {
        return sistemaActivado;
    }
}
