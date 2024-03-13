package org.example;

import java.util.Scanner;

public class Zoo {
    private final GestorAnimales gestorAnimales;
    private final GestorTrabajadores gestorTrabajadores;

    public Zoo() {
        this.gestorAnimales = new GestorAnimales();
        this.gestorTrabajadores = new GestorTrabajadores();
    }

    public void mostrarMenuPrincipal(Scanner scanner) {
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
                mostrarOpcionesVisitante(scanner);
                break;
            case 2:
                gestorTrabajadores.login(scanner);
                break;
            default:
                System.out.println("Opción no válida. Por favor, vuelva a iniciar sesión.");
        }
    }

    private void mostrarOpcionesVisitante(Scanner scanner) {
    int opcion;
    do {
        System.out.println("\n========================================");
        System.out.println("¡Bienvenido, visitante!");
        System.out.println("========================================\n");
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Información sobre animales");
        System.out.println("2. Información sobre hábitats");
        System.out.println("3. Tours disponibles");
        System.out.println("4. Atras");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción: ");

        opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el carácter de nueva línea restante

        switch (opcion) {
            case 1:
                GestorAnimales.mostrarInformacionAnimales();
                break;
            case 2:
                GestorAnimales.mostrarInformacionHabitats();
                break;
            case 3:
                GestorAnimales.mostrarToursDisponibles();
                break;
            case 4:
                return;  // Volver al menú anterior
            case 5:
                System.out.println("\n¡Gracias por visitarnos, vuelve pronto!");
                System.exit(0);  // Salir del programa
            default:
                System.out.println("Opción no válida. Por favor, vuelva a iniciar sesión.");
        }
    } while (opcion != 4 && opcion != 5);
}
}
