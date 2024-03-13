package cuidadoAnimales;

// Clase para representar un Tucán
public class Tucan extends Animal {
    private String colorPico;

    public Tucan(String diet, String colorPico) {
        super("Tucán", diet);
        this.colorPico = colorPico;
    }

    // Método específico para volar
    public void volar() {
        System.out.println("¡El tucán está volando!");
    }

    // Override del método mostrarInformacion() para mostrar información específica del tucán
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Tucán");
        System.out.println("Color del pico: " + colorPico);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
