package gestionHabitats;

import org.junit.Test;
import static org.junit.Assert.*;

public class HabitatTest {

    @Test
    public void testLimpiar() {
        Habitat habitat = new HabitatImpl("Bosque");
        habitat.limpiar();
    }

    // Clase interna para poder instanciar Habitat, ya que es abstracta
    private class HabitatImpl extends Habitat {
        public HabitatImpl(String tipo) {
            super(tipo);
        }

        @Override
        public void monitorear() {
            // No es necesario para las pruebas unitarias
        }
    }
}
