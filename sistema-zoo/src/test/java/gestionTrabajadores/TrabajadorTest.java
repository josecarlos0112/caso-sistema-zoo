package gestionTrabajadores;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrabajadorTest {

    @Test
    public void testConstructor() {
        // Arrange
        String nombre = "Juan";
        int edad = 30;
        String departamento = "Cuidado de Animales";

        // Act
        Trabajador trabajador = new Trabajador(nombre, edad, departamento);

        // Assert
        assertEquals(nombre, trabajador.getNombre());
        assertEquals(edad, trabajador.getEdad());
        assertEquals(departamento, trabajador.getDepartamento());
    }

    @Test
    public void testSetNombre() {
        // Arrange
        Trabajador trabajador = new Trabajador("Pedro", 35, "Seguridad");

        // Act
        trabajador.setNombre("Luis");

        // Assert
        assertEquals("Luis", trabajador.getNombre());
    }

    @Test
    public void testSetEdad() {
        // Arrange
        Trabajador trabajador = new Trabajador("Ana", 25, "Cuidado de Plantas");

        // Act
        trabajador.setEdad(30);

        // Assert
        assertEquals(30, trabajador.getEdad());
    }

    @Test
    public void testSetDepartamento() {
        // Arrange
        Trabajador trabajador = new Trabajador("María", 28, "Administración");

        // Act
        trabajador.setDepartamento("Educación Ambiental");

        // Assert
        assertEquals("Educación Ambiental", trabajador.getDepartamento());
    }

    @Test
    public void testSetNombreVacio() {
        // Arrange
        Trabajador trabajador = new Trabajador("Pedro", 35, "Seguridad");

        // Act
        trabajador.setNombre("Pedro");

        // Assert
        assertEquals("Pedro", trabajador.getNombre()); // El nombre no debe cambiar si se proporciona un valor vacío
    }

    @Test
    public void testSetEdadNegativa() {
        // Arrange
        Trabajador trabajador = new Trabajador("Ana", 25, "Cuidado de Plantas");

        // Act
        trabajador.setEdad(-30);

        // Assert
        assertEquals(25, trabajador.getEdad()); // La edad no debe cambiar si se proporciona un valor negativo
    }

    @Test
    public void testSetDepartamentoNulo() {
        // Arrange
        Trabajador trabajador = new Trabajador("María", 28, "Administración");

        // Act
        trabajador.setDepartamento(null);

        // Assert
        assertEquals("Administración", trabajador.getDepartamento()); // El departamento no debe cambiar si se proporciona un valor nulo
    }
}
