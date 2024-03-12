package interaccionVisitantes;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class VisitanteTest {

    @Test
    public void testAgregarInteres() {
        Visitante visitante = new Visitante("Juan");
        visitante.agregarInteres("Leones");
        visitante.agregarInteres("Pájaros");
        List<String> intereses = visitante.obtenerIntereses();
        assertEquals(2, intereses.size());
        assertTrue(intereses.contains("Leones"));
        assertTrue(intereses.contains("Pájaros"));
    }

    @Test
    public void testRecibirRecomendacionTour() {
        Visitante visitante = new Visitante("Juan");
        visitante.recibirRecomendacionTour("Tour de mamíferos");
    }

    @Test
    public void testMostrarInformacion() {
        Visitante visitante = new Visitante("Juan");
        visitante.agregarInteres("Leones");
        visitante.agregarInteres("Pájaros");
        visitante.mostrarInformacion();
    }
}
