package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("¡Bienvenido al Zoológico de la UAX!");
        System.out.println("=======================================");
        System.out.println("¿Eres un visitante o un trabajador?");
        System.out.println("1. Visitante");
        System.out.println("2. Trabajador");
        System.out.print("Ingrese su opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                mostrarOpcionesVisitante();
                break;
            case 2:
                loginTrabajador();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void mostrarOpcionesVisitante() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========================================");
        System.out.println("¡Bienvenido, visitante!");
        System.out.println("========================================\n");
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Información sobre animales");
        System.out.println("2. Información sobre hábitats");
        System.out.println("3. Tours disponibles");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                mostrarInformacionAnimales();
                break;
            case 2:
                mostrarInformacionHabitats();
                break;
            case 3:
                mostrarToursDisponibles();
                break;
            case 4:
                System.out.println("\n¡Gracias por visitarnos, vuelve pronto!");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void mostrarInformacionAnimales() {
        System.out.println("\n========================================");
        System.out.println("Información sobre los animales:");
        // Lógica para mostrar información sobre los animales
    }

    private static void mostrarInformacionHabitats() {
        System.out.println("\n========================================");
        System.out.println("Información sobre los hábitats:");
        // Lógica para mostrar información sobre los hábitats
    }

    private static void mostrarToursDisponibles() {
        System.out.println("\n========================================");
        System.out.println("Tours disponibles:");
        // Lógica para mostrar los tours disponibles
    }

    private static void loginTrabajador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========================================");
        System.out.println("Inicio de sesión de trabajador.");
        System.out.println("========================================\n");
        System.out.println("Por favor, ingresa tus credenciales:");

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Lógica para verificar las credenciales y proporcionar opciones según el rol del trabajador
    }
}
