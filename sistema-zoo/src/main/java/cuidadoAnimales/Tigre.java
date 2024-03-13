package cuidadoAnimales;

// Clase para representar un Tigre
public class Tigre extends Animal {
    private String patrónPelaje;

    public Tigre(String diet, String patrónPelaje) {
        super("Tigre", diet);
        this.patrónPelaje = patrónPelaje;
    }

    // Método específico para rugir
    public void rugir() {
        System.out.println("¡Rugido! El tigre está rugiendo.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del tigre
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Tigre");
        System.out.println("Patrón de pelaje: " + patrónPelaje);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
