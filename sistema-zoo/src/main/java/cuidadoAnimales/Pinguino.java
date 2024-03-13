package cuidadoAnimales;

// Clase para representar un Pingüino
public class Pinguino extends Animal {
    private int longitudAleta;

    public Pinguino(String diet, int longitudAleta) {
        super("Pingüino", diet);
        this.longitudAleta = longitudAleta;
    }

    // Método específico para nadar
    public void nadar() {
        System.out.println("El pingüino está nadando.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del pingüino
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Pingüino");
        System.out.println("Longitud de aleta: " + longitudAleta);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
