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
        System.out.println("Monitoreando el hábitat acuático...");
        // Simulación de lógica de monitoreo específica para hábitats acuáticos
        System.out.println("Nivel de agua actual: " + nivelAgua);
        if (nivelAgua < 50) {
            System.out.println("¡Alerta! Nivel de agua bajo. Se necesita rellenar el tanque.");
        }
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el hábitat acuático...");
        // Simulación de lógica de limpieza específica para hábitats acuáticos
        System.out.println("Limpiando el tanque...");
        System.out.println("Filtrando el agua...");
        limpieza = true;
        System.out.println("¡Hábitat acuático limpio!");
    }

    // Getters y setters específicos para hábitats acuáticos
    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }
}
