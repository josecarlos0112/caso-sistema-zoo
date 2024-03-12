package cuidadoAnimales;
import cuidadoAnimales.*;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void testFeed() {
        Leon leon = new Leon("Carne", 3);
    }

    @Test
    public void testCheckHealth() {
        Leon leon = new Leon("Carne", 3);
        leon.checkHealth();
    }

    @Test
    public void testObserveBehavior() {
        Leon leon = new Leon("Carne", 3);
        leon.observeBehavior();
    }

    // Agrega más tests según sea necesario para cubrir otros métodos y casos de uso
}

