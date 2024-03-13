package mantenimientoSeguridad;

// Clase para representar una cámara de seguridad
public class Camara {
    private String ubicacion;
    private boolean funcionando;

    // Constructor
    public Camara(String ubicacion) {
        this.ubicacion = ubicacion;
        this.funcionando = true;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    // Método para verificar el estado de la cámara
    public boolean verificarEstado() {
        return funcionando;
    }

    // Método para activar la cámara
    public void activar() {
        this.funcionando = true;
        System.out.println("La cámara en " + ubicacion + " ha sido activada.");
    }

    // Método para desactivar la cámara
    public void desactivar() {
        this.funcionando = false;
        System.out.println("La cámara en " + ubicacion + " ha sido desactivada.");
    }
}
