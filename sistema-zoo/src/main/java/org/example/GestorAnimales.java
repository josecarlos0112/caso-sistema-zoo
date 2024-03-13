package org.example;

import cuidadoAnimales.Animal;
import mantenimientoSeguridad.*;

import java.util.List;
import java.util.Scanner;

public class GestorAnimales {
    private static List<Camara> camaras;


    //-------------TRABAJADORES----------------

    // Método para registrar la alimentación de un animal
        public static void registrarAlimentacion() {
            Scanner scanner = new Scanner(System.in);

            // Permitir al cuidador crear un nuevo animal
            System.out.println("\nIngrese los datos del nuevo animal:\n");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Especie: ");
            String especie = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Peso (en kg): ");
            double peso = scanner.nextDouble();

            // Crear un nuevo animal
            Animal nuevoAnimal = new Animal(nombre, especie, edad, peso) {
                public String getNombre() {
                    return nombre;
                }
                public String getSpecies() {
                    return especie;
                }
                public int getEdad() {
                    return edad;
                }
                public String getPeso() {
                    return peso + " kg";
                }

                @Override
                public void mostrarInformacion() {
                    System.out.println("Nombre: " + this.getNombre());
                    System.out.println("Especie: " + this.getSpecies());
                    System.out.println("Edad: " + this.getEdad());
                    System.out.println("Peso (en kg): " + this.getPeso());
                }
            };

            // Registrar la alimentación del animal
            System.out.print("Ingrese el tipo de alimento: ");
            String tipoAlimento = scanner.next();
            System.out.print("Ingrese la cantidad de alimento (en gramos): ");
            int cantidadAlimento = scanner.nextInt();

            // Imprimir información del animal y la alimentación registrada
            System.out.println("\n¡Nuevo animal creado!:");
            nuevoAnimal.mostrarInformacion();
            System.out.println("\nAlimentación registrada:\n");
            System.out.println("Tipo de alimento: " + tipoAlimento);
            System.out.println("Cantidad de alimento: " + cantidadAlimento + " gramos");

        }

    // Método para registrar la limpieza de un hábitat
        public static void registrarLimpieza() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nSeleccione el hábitat que desea limpiar:\n");
            System.out.println("1. Hábitat Terrestre");
            System.out.println("2. Hábitat Acuatico");
            System.out.println("3. Hábitat Aviario");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            // Registrar la limpieza del hábitat seleccionado
            switch (opcion) {
                case 1:
                    System.out.println("Se ha registrado la limpieza del Hábitat Terrestre.");
                    break;
                case 2:
                    System.out.println("Se ha registrado la limpieza del Hábitat Acuatico.");
                    break;
                case 3:
                    System.out.println("Se ha registrado la limpieza del Hábitat Aviario.");
                    break;
                default:
                    System.out.println("Opción no válida. Vuelva a intentarlo");
            }
        }

    // Método para mostrar información sobre los animales
        public static void mostrarEstadoSaludAnimal() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la especie del animal para consultar su estado de salud:");
            String espconsultada = scanner.nextLine();
            System.out.println("Estado de salud: Saludable");
        }

    // Metodo para observar el comportamiento de los animales
        public static void observarComportamientoAnimal() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la especie del animal para observar su comportamiento:");
            String espobservada = scanner.nextLine();
            System.out.println("Comportamiento: Tranquilo");
        }

    //Método para registrar entrada de visitantes
        public static void registrarEntradaVisitantes() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el número de visitantes que entran al zoológico:");
            int numvisitantes = scanner.nextInt();
            System.out.println("Se han registrado " + numvisitantes + " visitantes por el día de hoy.");
        }

    //Método para registrar salida de visitantes
        public static void registrarSalidaVisitantes() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el número de visitantes que salen del zoológico:");
            int numvisitantes = scanner.nextInt();
            System.out.println("Se ha registrado la salida de " + numvisitantes + " visitantes irse por el día de hoy.");
        }

    //Método para verificar estado de seguridad
        public static void verificarEstadoSeguridad() {
            Seguridad.activarSistema(); // Activar el sistema de seguridad
            camaras = Seguridad.getCamaras();
        }

    //Método para realizar el Tour Guiado
        public static void realizarTourGuiado() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, ingrese los datos del tour guiado a realizar:");

            System.out.print("Nombre del tour: ");
            String nombreTour = scanner.nextLine();

            System.out.print("Hora de inicio (HH:MM): ");
            String horaInicio = scanner.nextLine();

            System.out.println("\n¡Datos del tour ingresados con éxito!");
            System.out.println("Nombre del tour: " + nombreTour);
            System.out.println("Hora de inicio: " + horaInicio);
        }
    // Método para crear un Tour Guiado
        public static void crearNuevoTourGuiado() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, ingrese los detalles del nuevo tour a crear:");

            System.out.print("Nombre del nuevo tour: ");
            String nombreTour = scanner.nextLine();

            System.out.print("Descripción del nuevo tour: ");
            String descripcionTour = scanner.nextLine();

            System.out.print("Duración del nuevo tour (en horas): ");
            double duracionTour = scanner.nextDouble();

            // Aquí puedes realizar cualquier otra lógica necesaria para el nuevo tour

            System.out.println("\n¡Nuevo tour creado con éxito!");
            System.out.println("Nombre: " + nombreTour);
            System.out.println("Descripción: " + descripcionTour);
            System.out.println("Duración: " + duracionTour + " horas");
        }

    //Método para realizar el chequeo de salud
        public static void realizarChequeoSalud() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, ingrese la especie del animal para realizar el chequeo de salud:");

            String especie = scanner.nextLine();


            if (especie != null) {
                System.out.println("Se realizará el el chequeo de salud para el siguiente animal:");
                System.out.println(especie);
                System.out.println("Realizando chequeo de salud...");

                try {
                    Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("¡Chequeo de salud completado con éxito!");
                Animal.setHealthStatus("Saludable");
                System.out.println("Estado de salud: " + Animal.getHealthStatus());
            } else {
                System.out.println("No se encontró ningún animal de la especie especificada.");
            }
        }

    //---------------VISITANTES----------------
        public static void mostrarInformacionAnimales() {
            System.out.println("\n========================================");
            System.out.println("Información sobre los animales:");
            System.out.println("========================================\n");

            // Lógica para mostrar información sobre los animales
        }

        public static void mostrarInformacionHabitats() {
            System.out.println("\n========================================");
            System.out.println("Información sobre los hábitats:");
            System.out.println("========================================\n");


            // Lógica para mostrar información sobre los hábitats
        }

        public static void mostrarToursDisponibles() {
            System.out.println("\n========================================");
            System.out.println("Tours disponibles:");
            System.out.println("========================================\n");

            // Lógica para mostrar los tours disponibles
        }
    }
