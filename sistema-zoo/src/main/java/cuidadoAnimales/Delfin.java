package cuidadoAnimales;

// Clase para representar un Delfín
public class Delfin extends Animal {
    private int longitudAleta;

    public Delfin(String diet, int longitudAleta) {
        super("Delfín", diet);
        this.longitudAleta = longitudAleta;
    }

    // Método específico para nadar
    public void nadar() {
        System.out.println("El delfín está nadando.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del delfín
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Delfín");
        System.out.println("Longitud de aleta: " + longitudAleta);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
