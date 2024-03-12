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
                System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
        }
    }

    private static void mostrarMenuPrincipal() {
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
                mostrarOpcionesTipoTrabajador();
                break;
            default:
                System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
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
                System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
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

    private static boolean validarCredenciales(String usuario, String contrasena) {
        // Por ahora, simplemente retornaremos true para cualquier entrada
        return true;
    }

    private static final String[] TIPOS_TRABAJADORES = {"Cuidador", "Guardia", "Guía Turístico", "Veterinario"};

    private static void mostrarMenuTrabajador(String tipoTrabajador) {
        Scanner scanner = new Scanner(System.in);

        switch (tipoTrabajador) {
            case "Cuidador":
                System.out.println("\n========================================");
                System.out.println("¡Bienvenido, Cuidador!");
                System.out.println("========================================\n");
                System.out.println("Por favor, seleccione una opción:");
                System.out.println("1. Registrar alimentación de animales");
                System.out.println("2. Registrar limpieza de hábitats");
                System.out.println("3. Consultar estado de salud de animales");
                System.out.println("4. Observar comportamiento de animales");
                System.out.println("5. Salir");
                System.out.print("Ingrese su opción: ");

                int opcionCuidador = scanner.nextInt();

                switch (opcionCuidador) {
                    case 1:
                        // Lógica para registrar alimentación de animales
                        break;
                    case 2:
                        // Lógica para registrar limpieza de hábitats
                        break;
                    case 3:
                        // Lógica para consultar estado de salud de animales
                        break;
                    case 4:
                        // Lógica para observar comportamiento de animales
                        break;
                    case 5:
                        System.out.println("\n¡Gracias por tu trabajo!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
                }
                break;
            case "Guardia":
                System.out.println("\n========================================");
                System.out.println("¡Bienvenido, Guardia!");
                System.out.println("========================================\n");
                System.out.println("Por favor, seleccione una opción:");
                System.out.println("1. Registrar entrada de visitantes");
                System.out.println("2. Registrar salida de visitantes");
                System.out.println("3. Verificar estado de seguridad");
                System.out.println("4. Salir");
                System.out.print("Ingrese su opción: ");

                int opcionGuardia = scanner.nextInt();

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
                break;
            case "GuiaTuristico":
                System.out.println("\n========================================");
                System.out.println("¡Bienvenido, Guía Turístico!");
                System.out.println("========================================\n");
                System.out.println("Por favor, seleccione una opción:");
                System.out.println("1. Realizar tour guiado");
                System.out.println("2. Crear nuevo tour guiado");
                System.out.println("3. Salir");
                System.out.print("Ingrese su opción: ");

                int opcionGuia = scanner.nextInt();

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
                break;
            case "Veterinario":
                System.out.println("\n========================================");
                System.out.println("¡Bienvenido, Veterinario!");
                System.out.println("========================================\n");
                System.out.println("Por favor, seleccione una opción:");
                System.out.println("1. Realizar chequeo de salud de animales");
                System.out.println("2. Salir");
                System.out.print("Ingrese su opción: ");

                int opcionVeterinario = scanner.nextInt();

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
                break;
            default:
                System.out.println("Tipo de trabajador no reconocido.");
        }
    }


    private static void mostrarOpcionesTipoTrabajador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========================================");
        System.out.println("Seleccione su tipo de trabajador:");
        System.out.println("========================================\n");

        for (int i = 0; i < TIPOS_TRABAJADORES.length; i++) {
            System.out.println((i + 1) + ". " + TIPOS_TRABAJADORES[i]);
        }

        System.out.println((TIPOS_TRABAJADORES.length + 1) + ". Atrás");
        System.out.print("Ingrese su opción: ");

        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= TIPOS_TRABAJADORES.length) {
            // Seleccionar tipo de trabajador y mostrar menú correspondiente
            mostrarMenuTrabajador(TIPOS_TRABAJADORES[opcion - 1]);
        } else if (opcion == TIPOS_TRABAJADORES.length + 1) {
            // Regresar al menú principal
            mostrarMenuPrincipal();
        } else {
            System.out.println("Opción no válida. Por favor, vuelva a iniciar sesion.");
        }
    }




}
