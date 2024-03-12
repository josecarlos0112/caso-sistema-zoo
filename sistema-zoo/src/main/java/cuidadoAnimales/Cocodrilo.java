package cuidadoAnimales;

// Clase para representar un Cocodrilo
public class Cocodrilo extends Animal {
    private int longitudCola;

    public Cocodrilo(String diet, int longitudCola) {
        super("Cocodrilo", diet);
        this.longitudCola = longitudCola;
    }

    // Método específico para nadar
    public void nadar() {
        System.out.println("El cocodrilo está nadando en el agua.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del cocodrilo
    @Override
    public void mostrarInformacion() {
        System.out.println("Especies: Cocodrilo");
        System.out.println("Longitud de la cola: " + longitudCola + " cm");
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
