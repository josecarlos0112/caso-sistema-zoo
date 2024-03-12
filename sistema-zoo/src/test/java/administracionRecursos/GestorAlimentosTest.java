package administracionRecursos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GestorAlimentosTest {

    @Test
    public void testAgregarAlimento() {
        GestorAlimentos gestor = new GestorAlimentos();
        gestor.agregarAlimento("Carne", 100); // Agregar 100 kg de carne al inventario
        assertEquals(100, gestor.obtenerStock("Carne")); // Verificar que el stock de carne sea 100
    }

    @Test
    public void testEliminarAlimento() {
        GestorAlimentos gestor = new GestorAlimentos();
        gestor.agregarAlimento("Carne", 100); // Agregar 100 kg de carne al inventario
        gestor.eliminarAlimento("Carne", 50); // Eliminar 50 kg de carne del inventario
        assertEquals(50, gestor.obtenerStock("Carne")); // Verificar que el stock de carne sea 50
    }

    @Test
    public void testObtenerStockInexistente() {
        GestorAlimentos gestor = new GestorAlimentos();
        assertEquals(0, gestor.obtenerStock("Plantas")); // Verificar que el stock de plantas sea 0 (inexistente)
    }

    // Agrega más tests según sea necesario para cubrir otros métodos y casos de uso
}
