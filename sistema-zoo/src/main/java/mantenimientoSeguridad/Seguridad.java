package mantenimientoSeguridad;

import java.util.List;

// Clase para representar la seguridad del zoológico
public class Seguridad {
    private static boolean sistemaActivado;

    // Constructor
    public Seguridad() {
        sistemaActivado = false;
    }

    // Método para activar el sistema de seguridad
    public static void activarSistema() {
        sistemaActivado = true;
        System.out.println("El sistema de seguridad ha sido activado.");
    }

    // Método para desactivar el sistema de seguridad
    public static void desactivarSistema() {
        sistemaActivado = false;
        System.out.println("El sistema de seguridad ha sido desactivado.");
    }

    public static List<Camara> getCamaras() {
        System.out.println("Las cámaras han sido activadas.");
        return null;
    }

    // Getters y setters
    public boolean isSistemaActivado() {
        return sistemaActivado;
    }
}
