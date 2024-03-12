package gestionTrabajadores;

// Clase base para representar a un trabajador del zoológico
public class Trabajador {
    protected String nombre;
    protected int edad;
    protected String departamento;

    // Constructor
    public Trabajador(String nombre, int edad, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEdad(int edad) {
        if (edad >= 0) { // Verifica si la edad es no negativa
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setDepartamento(String departamento) {
        if (departamento != null) { // Verifica si el departamento no es nulo
            this.departamento = departamento;
        } else {
            System.out.println("El departamento no puede ser nulo.");
        }
    }

    public String getDepartamento() {
        return departamento;
    }

}
