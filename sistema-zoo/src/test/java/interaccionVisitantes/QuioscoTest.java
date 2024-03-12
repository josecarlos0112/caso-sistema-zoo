package interaccionVisitantes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuioscoTest {

    @Test
    public void testProporcionarInformacion() {
        Quiosco quiosco = new Quiosco("Chamberi");
        // Verifica que el método de proporcionar información funciona correctamente
        assertEquals("Chamberi", quiosco.getUbicacion());
        quiosco.proporcionarInformacion();
    }
}
