package interaccionVisitantes;

import java.util.ArrayList;
import java.util.List;

// Clase para representar a un visitante del zoológico
public class Visitante {
    private String nombre;
    private List<String> intereses;

    // Constructor
    public Visitante(String nombre) {
        this.nombre = nombre;
        this.intereses = new ArrayList<>();
    }

    // Método para agregar un interés al visitante
    public void agregarInteres(String interes) {
        intereses.add(interes);
    }

    // Método para obtener información sobre los intereses del visitante
    public List<String> obtenerIntereses() {
        return intereses;
    }

    // Método para recibir una recomendación de tour basada en los intereses del visitante
    public void recibirRecomendacionTour(String tourRecomendado) {
        System.out.println("Hola " + nombre + ", te recomendamos el tour: " + tourRecomendado);
    }

    // Método para imprimir información del visitante
    public void mostrarInformacion() {
        System.out.println("Nombre del visitante: " + nombre);
        System.out.println("Intereses:");
        for (String interes : intereses) {
            System.out.println("- " + interes);
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
