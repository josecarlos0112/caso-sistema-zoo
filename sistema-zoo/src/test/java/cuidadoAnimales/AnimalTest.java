package cuidadoAnimales;

import org.junit.Test;

public class AnimalTest {

    @Test
    public void testFeed() {
        Animal animal = new AnimalImpl("Tigre", "Carne");
        animal.feed("Carne");
    }

    @Test
    public void testCheckHealth() {
        Animal animal = new AnimalImpl("Tigre", "Carne");
        animal.checkHealth();
    }

    @Test
    public void testObserveBehavior() {
        Animal animal = new AnimalImpl("Tigre", "Carne");
        animal.observeBehavior();
    }

    // Clase interna para poder instanciar Animal, ya que es abstracta
    private class AnimalImpl extends Animal {
        public AnimalImpl(String species, String diet) {
            super(species, diet);
        }

        @Override
        public void mostrarInformacion() {
            // No es necesario para las pruebas unitarias
        }
    }
}
