package cuidadoAnimales;

// Clase para representar un Loro
public class Loro extends Animal {
    private String colorPlumaje;

    public Loro(String diet, String colorPlumaje) {
        super("Loro", diet);
        this.colorPlumaje = colorPlumaje;
    }

    // Método específico para hablar
    public void hablar() {
        System.out.println("¡El loro está hablando!");
    }

    // Override del método mostrarInformacion() para mostrar información específica del loro
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Loro");
        System.out.println("Color del plumaje: " + colorPlumaje);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
