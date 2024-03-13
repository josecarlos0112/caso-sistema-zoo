package org.example;

import java.util.Scanner;

public class GestorTrabajadores {
    public void login(Scanner scanner) {
        boolean continuar = true;
        while (continuar){
            System.out.println("\n========================================");
            System.out.println("Inicio de sesión de trabajador.");
            System.out.println("========================================\n");
            System.out.println("Por favor, ingresa tus credenciales:");

            System.out.print("Usuario: ");
            scanner.nextLine();
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            // Lógica para verificar las credenciales y proporcionar opciones según el rol del trabajador
            boolean credencialesValidas = validarCredenciales(usuario, contrasena);

            if (credencialesValidas) {
                System.out.println("\n¡Inicio de sesión exitoso!\n");

                System.out.println("Selecciona tu área de trabajo:");
                System.out.println("1. Cuidador");
                System.out.println("2. Guardia");
                System.out.println("3. Guía Turístico");
                System.out.println("4. Veterinario");
                System.out.print("Ingrese su opción: ");

                int opcionTrabajador = scanner.nextInt();

                switch (opcionTrabajador) {
                    case 1:
                        mostrarMenuTrabajador("Cuidador");
                        break;
                    case 2:
                        mostrarMenuTrabajador("Guardia");
                        break;
                    case 3:
                        mostrarMenuTrabajador("GuiaTuristico");
                        break;
                    case 4:
                        mostrarMenuTrabajador("Veterinario");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
                }
            } else {
                System.out.println("\nCredenciales incorrectas. Por favor, inténtalo de nuevo.");
            }
        }

    }

    private boolean validarCredenciales(String usuario, String contrasena) {
        // Por ahora, simplemente retornaremos true para cualquier entrada
        return true;
    }

    private static void mostrarMenuTrabajador(String tipoTrabajador) {
        Scanner scanner = new Scanner(System.in);
        int opcionTrabajador;
        int opcionGuardia;
        int opcionGuia;
        int opcionVeterinario;

        switch (tipoTrabajador) {
            case "Cuidador":
                do {
                    System.out.println("\n========================================");
                    System.out.println("¡Bienvenido, Cuidador!");
                    System.out.println("========================================\n");
                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Registrar alimentación de animales");
                    System.out.println("2. Registrar limpieza de hábitats");
                    System.out.println("3. Consultar estado de salud de animales");
                    System.out.println("4. Observar comportamiento de animales");
                    System.out.println("5. Atras");
                    System.out.println("6. Salir");
                    System.out.print("Ingrese su opción: ");

                    opcionTrabajador = scanner.nextInt();

                    switch (opcionTrabajador) {
                        case 1:
                            GestorAnimales.registrarAlimentacion();
                            break;
                        case 2:
                            GestorAnimales.registrarLimpieza();
                            break;
                        case 3:
                            GestorAnimales.mostrarEstadoSaludAnimal();
                            break;
                        case 4:
                            GestorAnimales.observarComportamientoAnimal();
                            break;
                        case 5:
                            return;  // Volver al menú anterior
                        case 6:
                            System.out.println("\n¡Gracias por tu trabajo!");
                            System.exit(0);  // Salir del programa
                        default:
                            System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
                    }
                } while (opcionTrabajador != 5 && opcionTrabajador != 6);
                break;
            case "Guardia":
                do {
                    System.out.println("\n========================================");
                    System.out.println("¡Bienvenido, Guardia!");
                    System.out.println("========================================\n");
                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Registrar entrada de visitantes");
                    System.out.println("2. Registrar salida de visitantes");
                    System.out.println("3. Verificar estado de seguridad");
                    System.out.println("4. Salir");
                    System.out.print("Ingrese su opción: ");

                    opcionGuardia = scanner.nextInt();

                    switch (opcionGuardia) {
                        case 1:
                            // Lógica para registrar entrada de visitantes
                            break;
                        case 2:
                            // Lógica para registrar salida de visitantes
                            break;
                        case 3:
                            // Lógica para verificar estado de seguridad
                            break;
                        case 4:
                            System.out.println("\n¡Gracias por tu trabajo!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
                    }
                } while (opcionGuardia != 5 && opcionGuardia != 6);
                break;
            case "GuiaTuristico":
                do {
                    System.out.println("\n========================================");
                    System.out.println("¡Bienvenido, Guía Turístico!");
                    System.out.println("========================================\n");
                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Realizar tour guiado");
                    System.out.println("2. Crear nuevo tour guiado");
                    System.out.println("3. Salir");
                    System.out.print("Ingrese su opción: ");

                    opcionGuia = scanner.nextInt();

                    switch (opcionGuia) {
                        case 1:
                            // Lógica para realizar tour guiado
                            break;
                        case 2:
                            // Lógica para crear nuevo tour guiado
                            break;
                        case 3:
                            System.out.println("\n¡Gracias por tu trabajo!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
                    }
                } while (opcionGuia != 5 && opcionGuia != 6);
                break;
            case "Veterinario":
                do {
                    System.out.println("\n========================================");
                    System.out.println("¡Bienvenido, Veterinario!");
                    System.out.println("========================================\n");
                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Realizar chequeo de salud de animales");
                    System.out.println("2. Salir");
                    System.out.print("Ingrese su opción: ");

                    opcionVeterinario = scanner.nextInt();

                    switch (opcionVeterinario) {
                        case 1:
                            // Lógica para realizar chequeo de salud de animales
                            break;
                        case 2:
                            System.out.println("\n¡Gracias por tu trabajo!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
                    }
                } while (opcionVeterinario != 5 && opcionVeterinario != 6);
                break;
            default:
                System.out.println("Tipo de trabajador no reconocido.");

        }
    }
}
