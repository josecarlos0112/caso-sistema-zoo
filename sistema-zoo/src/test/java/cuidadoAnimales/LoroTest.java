package cuidadoAnimales;

import org.junit.Test;

public class LoroTest {
    // Prueba para el método hablar
    @Test
    public void testHablar() {
        Loro loro = new Loro("Semillas", "Verde");
        loro.hablar();
    }

    // Prueba para el método mostrarInformacion
    @Test
    public void testMostrarInformacion() {
        Loro loro = new Loro("Semillas", "Verde");
        loro.mostrarInformacion();
    }
}
