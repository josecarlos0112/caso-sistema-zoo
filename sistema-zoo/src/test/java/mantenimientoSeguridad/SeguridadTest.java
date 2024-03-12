package mantenimientoSeguridad;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeguridadTest {

    @Test
    public void testActivarSistema() {
        Seguridad seguridad = new Seguridad();
        seguridad.activarSistema();
        assertTrue(seguridad.isSistemaActivado());
    }

    @Test
    public void testDesactivarSistema() {
        Seguridad seguridad = new Seguridad();
        seguridad.desactivarSistema();
        assertFalse(seguridad.isSistemaActivado());
    }
}
