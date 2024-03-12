package interaccionVisitantes;

// Clase para representar a un visitante del zoológico
public class Visitante {
    private String nombre;
    private String intereses;

    // Constructor
    public Visitante(String nombre, String intereses) {
        this.nombre = nombre;
        this.intereses = intereses;
    }

    // Método para obtener información sobre los intereses del visitante
    public String obtenerIntereses() {
        return intereses;
    }

    // Método para recibir una recomendación de tour basada en los intereses del visitante
    public void recibirRecomendacionTour(String tourRecomendado) {
        System.out.println("Hola " + nombre + ", te recomendamos el tour: " + tourRecomendado);
    }
}
