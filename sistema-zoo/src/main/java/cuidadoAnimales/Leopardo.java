package cuidadoAnimales;

// Clase para representar un Leopardo
public class Leopardo extends Animal {
    private String patronPelaje;

    public Leopardo(String diet, String patrónPelaje) {
        super("Leopardo", diet);
        this.patronPelaje = patrónPelaje;
    }

    // Método específico para trepar
    public void trepar() {
        System.out.println("El leopardo está trepando por los árboles.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del leopardo
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Leopardo");
        System.out.println("Patrón de pelaje: " + patronPelaje);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
