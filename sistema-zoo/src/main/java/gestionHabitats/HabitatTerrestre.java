package gestionHabitats;

// Clase para representar un hábitat terrestre
public class HabitatTerrestre extends Habitat {
    private String tipoSuelo;

    // Constructor
    public HabitatTerrestre() {
        super("Terrestre");
    }

    // Implementación de métodos abstractos
    @Override
    public void monitorear() {
        // Implementar lógica de monitoreo específica para hábitats terrestres
    }

    @Override
    public void limpiar() {
        // Implementar lógica de limpieza específica para hábitats terrestres
    }

    // Getters y setters específicos para hábitats terrestres
    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }
}
