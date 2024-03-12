package interaccionVisitantes;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TourTest {

    @Test
    public void testAgregarPuntoInteres() {
        Tour tour = new Tour("Tour de mamíferos", "Explora los hábitats de los mamíferos del zoológico");
        tour.agregarPuntoInteres("Hábitat de leones");
        tour.agregarPuntoInteres("Hábitat de osos");
        List<String> puntosInteres = tour.getPuntosInteres();
        assertEquals(2, puntosInteres.size());
        assertTrue(puntosInteres.contains("Hábitat de leones"));
        assertTrue(puntosInteres.contains("Hábitat de osos"));
    }

    @Test
    public void testMostrarInformacion() {
        Tour tour = new Tour("Tour de mamíferos", "Explora los hábitats de los mamíferos del zoológico");
        tour.agregarPuntoInteres("Hábitat de leones");
        tour.agregarPuntoInteres("Hábitat de osos");
        tour.mostrarInformacion();
    }
}
