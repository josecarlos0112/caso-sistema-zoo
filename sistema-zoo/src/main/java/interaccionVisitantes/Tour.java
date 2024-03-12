package interaccionVisitantes;

import java.util.ArrayList;
import java.util.List;

// Clase para representar un tour en el zoológico
public class Tour {
    private String nombre;
    private String descripcion;
    private List<String> puntosInteres;

    // Constructor
    public Tour(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puntosInteres = new ArrayList<>();
    }

    // Método para agregar un punto de interés al tour
    public void agregarPuntoInteres(String punto) {
        puntosInteres.add(punto);
    }

    // Método para obtener la lista de puntos de interés del tour
    public List<String> getPuntosInteres() {
        return puntosInteres;
    }

    // Método para mostrar la información del tour
    public void mostrarInformacion() {
        System.out.println("Tour: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Puntos de interés:");
        for (String punto : puntosInteres) {
            System.out.println("- " + punto);
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
