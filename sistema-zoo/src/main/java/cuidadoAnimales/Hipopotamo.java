package cuidadoAnimales;

// Clase para representar un Hipopótamo
public class Hipopotamo extends Animal {
    private int peso;

    public Hipopotamo(String diet, int peso) {
        super("Hipopótamo", diet);
        this.peso = peso;
    }

    // Método específico para nadar
    public void nadar() {
        System.out.println("El hipopótamo está nadando en el agua.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del hipopótamo
    @Override
    public void mostrarInformacion() {
        System.out.println("Especies: Hipopótamo");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
