package gestionHabitats;

// Clase para representar un aviario
public class HabitatAviario extends Habitat {
    private int cantidadPajaros;

    // Constructor
    public HabitatAviario() {
        super("Aviario");
    }

    // Implementación de métodos abstractos
    @Override
    public void monitorear() {
        // Implementar lógica de monitoreo específica para aviarios
    }

    @Override
    public void limpiar() {
        // Implementar lógica de limpieza específica para aviarios
    }

    // Getters y setters específicos para aviarios
    public int getCantidadPajaros() {
        return cantidadPajaros;
    }

    public void setCantidadPajaros(int cantidadPajaros) {
        this.cantidadPajaros = cantidadPajaros;
    }
}
