package cuidadoAnimales;

// Clase para representar un Mono
public class Mono extends Animal {
    private String tipoPelaje;

    public Mono(String diet, String tipoPelaje) {
        super("Mono", diet);
        this.tipoPelaje = tipoPelaje;
    }

    // Método específico para trepar
    public void trepar() {
        System.out.println("El mono está trepando por los árboles.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del mono
    @Override
    public void mostrarInformacion() {
        System.out.println("Especies: Mono");
        System.out.println("Tipo de pelaje: " + tipoPelaje);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
