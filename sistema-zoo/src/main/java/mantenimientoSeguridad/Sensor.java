package mantenimientoSeguridad;

// Clase para representar un sensor de seguridad
public class Sensor {
    private String tipo;
    private boolean activado;

    // Constructor
    public Sensor(String tipo) {
        this.tipo = tipo;
        this.activado = false;
    }

    // Método para activar el sensor
    public void activar() {
        this.activado = true;
        System.out.println("El sensor de " + tipo + " ha sido activado.");
    }

    // Método para desactivar el sensor
    public void desactivar() {
        this.activado = false;
        System.out.println("El sensor de " + tipo + " ha sido desactivado.");
    }

    // Método para verificar si el sensor está activado
    public boolean isActivado() {
        return activado;
    }
}
