package gestionHabitats;

// Clase para representar un hábitat acuático
public class HabitatAcuatico extends Habitat {
    private int nivelAgua;

    // Constructor
    public HabitatAcuatico() {
        super("Acuático");
    }

    // Implementación de métodos abstractos
    @Override
    public void monitorear() {
        // Implementar lógica de monitoreo específica para hábitats acuáticos
    }

    @Override
    public void limpiar() {
        // Implementar lógica de limpieza específica para hábitats acuáticos
    }

    // Getters y setters específicos para hábitats acuáticos
    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }
}
