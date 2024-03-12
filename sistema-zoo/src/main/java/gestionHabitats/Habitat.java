package gestionHabitats;

// Clase base para representar un hábitat genérico
public abstract class Habitat {
    protected String tipo;
    protected int temperatura;
    protected int humedad;
    protected boolean limpieza;

    // Constructor
    public Habitat(String tipo) {
        this.tipo = tipo;
    }

    // Método para monitorear el hábitat
    public abstract void monitorear();

    // Método para limpiar el hábitat
    public void limpiar() {
        if (!limpieza) {
            System.out.println("Limpiando el hábitat de tipo " + tipo);
            limpieza = true;
        } else {
            System.out.println("El hábitat de tipo " + tipo + " ya está limpio.");
        }
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
}