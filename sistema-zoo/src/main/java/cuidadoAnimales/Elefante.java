package cuidadoAnimales;

// Clase para representar un Elefante
public class Elefante extends Animal {
    private int longitudTrompa;

    public Elefante(String diet, int longitudTrompa) {
        super("Elefante", diet);
        this.longitudTrompa = longitudTrompa;
    }

    // Método específico para barritar
    public void barritar() {
        System.out.println("¡Barritando! El elefante está barritando.");
    }

    // Override del método mostrarInformacion() para mostrar información específica del elefante
    @Override
    public void mostrarInformacion() {
        System.out.println("Especie: Elefante");
        System.out.println("Longitud de trompa: " + longitudTrompa);
        System.out.println("Dieta: " + getDiet());
        System.out.println("Estado de salud: " + getHealthStatus());
        System.out.println("Comportamiento: " + getBehavior());
    }
}
