package cuidadoAnimales;

// Clase para representar un Oso Polar
public class OsoPolar extends Animal {
    private int longitudPatas;

    public OsoPolar(String diet, int longitudPatas) {
        super("Oso Polar", diet);
        this.longitudPatas = longitudPatas;
    }

    // Método específico para nadar
    public void nadar() {
        System.out.println("El oso polar está nadando en aguas heladas.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del oso polar
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Oso Polar");
        System.out.println("Longitud de patas: " + longitudPatas);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
