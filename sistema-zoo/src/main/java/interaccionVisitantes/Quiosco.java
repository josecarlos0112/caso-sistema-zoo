package interaccionVisitantes;

import gestionHabitats.Habitat;
import cuidadoAnimales.Animal;

import java.util.HashMap;
import java.util.Map;

// Clase para representar un quiosco interactivo en el zoológico
public class Quiosco {
    private String ubicacion;
    private Map<String, Animal> animales;
    private Map<String, Habitat> habitats;

    // Constructor
    public Quiosco(String ubicacion) {
        this.ubicacion = ubicacion;
        this.animales = new HashMap<>();
        this.habitats = new HashMap<>();
    }

    // Método para proporcionar información sobre los animales y hábitats
    public void proporcionarInformacion() {
        System.out.println("Bienvenido al quiosco interactivo en " + ubicacion + ".");
        System.out.println("Aquí puedes obtener información sobre los animales y hábitats del zoológico.");

        // Mostrar información sobre los animales
        System.out.println("Animales en exhibición:");
        for (String nombre : animales.keySet()) {
            Animal animal = animales.get(nombre);
            System.out.println("- " + animal.getSpecies() + ": " + animal.getBehavior());
        }

        // Mostrar información sobre los hábitats
        System.out.println("\nHábitats en el zoológico:");
        for (String tipo : habitats.keySet()) {
            Habitat habitat = habitats.get(tipo);
            System.out.println("- " + habitat.getTipo() + ": Temperatura: " + habitat.getTemperatura() + "°C, Humedad: " + habitat.getHumedad() + "%");
        }
    }

    // Método getter para obtener la ubicación del quiosco
    public String getUbicacion() {
        return ubicacion;
    }

    // Método para agregar un animal al quiosco
    public void agregarAnimal(Animal animal) {
        animales.put(animal.getSpecies(), animal);
    }

    // Método para agregar un hábitat al quiosco
    public void agregarHabitat(Habitat habitat) {
        habitats.put(habitat.getTipo(), habitat);
    }
}
