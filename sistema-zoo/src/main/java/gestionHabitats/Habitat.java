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

    // Métodos abstractos
    public abstract void monitorear();

    public abstract void limpiar();

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
