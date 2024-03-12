package interaccionVisitantes;

// Clase para representar un quiosco interactivo en el zoológico
public class Quiosco {
    private String ubicacion;

    // Constructor
    public Quiosco(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método para proporcionar información sobre los animales y hábitats
    public void proporcionarInformacion() {
        System.out.println("Bienvenido al quiosco interactivo en " + ubicacion + ".");
        System.out.println("Aquí puedes obtener información sobre los animales y hábitats del zoológico.");
        // Lógica para proporcionar información interactiva
    }
}
