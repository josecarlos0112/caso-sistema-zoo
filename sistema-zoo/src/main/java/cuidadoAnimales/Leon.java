package cuidadoAnimales;

// Clase para representar un León
public class Leon extends Animal {
    private int cantidadMelena;

    public Leon(String diet, int cantidadMelena) {
        super("León", diet);
        this.cantidadMelena = cantidadMelena;
    }

    // Método específico para rugir
    public void rugir() {
        System.out.println("¡Rugido! El león está rugiendo.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del león
    @Override
    public void mostrarInformacion() {
        System.out.println("Especies: León");
        System.out.println("Cantidad de melena: " + cantidadMelena);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
