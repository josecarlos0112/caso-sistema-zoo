package gestionTrabajadores;

// Clase para representar a un guía turístico del zoológico
public class GuiaTuristico extends Trabajador {
    private String idiomas;

    // Constructor
    public GuiaTuristico(String nombre, int edad, String departamento, String idiomas) {
        super(nombre, edad, departamento);
        this.idiomas = idiomas;
    }

    // Getter y setter específico para los idiomas
    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
}
