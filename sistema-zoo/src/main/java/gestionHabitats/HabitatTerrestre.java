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
        System.out.println("Monitoreando el hábitat terrestre...");
        // Implementar lógica de monitoreo específica para hábitats terrestres
        System.out.println("Tipo de suelo: " + tipoSuelo);
        // Agregar más lógica de monitoreo si es necesario
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el hábitat terrestre...");
        // Implementar lógica de limpieza específica para hábitats terrestres
        System.out.println("Recogiendo desechos del suelo...");
        System.out.println("Regando el suelo...");
        limpieza = true;
        System.out.println("¡Hábitat terrestre limpio!");
    }

    // Getters y setters específicos para hábitats terrestres
    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }
}
