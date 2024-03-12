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
        System.out.println("Monitoreando el aviario...");
        // Implementar lógica de monitoreo específica para aviarios
        System.out.println("Cantidad de pájaros en el aviario: " + cantidadPajaros);
        // Agregar más lógica de monitoreo si es necesario
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el aviario...");
        // Implementar lógica de limpieza específica para aviarios
        System.out.println("Limpiando el suelo del aviario...");
        System.out.println("Revisando y reponiendo el alimento...");
        limpieza = true;
        System.out.println("¡Aviario limpio!");
    }

    // Getters y setters específicos para aviarios
    public int getCantidadPajaros() {
        return cantidadPajaros;
    }

    public void setCantidadPajaros(int cantidadPajaros) {
        this.cantidadPajaros = cantidadPajaros;
    }
}
