package org.example;
import cuidadoAnimales.Animal;

public class GestorAnimales {
    private static void mostrarListaAnimales() {
        // Aquí asumimos que tienes una lista de animales disponible en algún lugar
        // Supongamos que tienes una lista llamada listaAnimales de tipo List<Animal>
        System.out.println("Lista de animales disponibles:");
        for (Animal animal : listaAnimales) {
            System.out.println("ID: " + animal.getId() + " - Especie: " + animal.getSpecies());
        }
    }
    private static Animal buscarAnimalPorId(int idAnimal) {
        // Buscamos el animal por su ID en la lista de animales
        for (Animal animal : listaAnimales) {
            if (animal.getId() == idAnimal) {
                return animal;
            }
        }
        return null; // Si no se encuentra ningún animal con el ID proporcionado
    }
}
