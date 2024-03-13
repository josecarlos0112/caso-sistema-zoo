package org.example;

import cuidadoAnimales.Animal;

import java.util.Scanner;

public class GestorAnimales {

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







    //---------------VISITANTES----------------
        public void mostrarInformacionAnimales() {
            System.out.println("\n========================================");
            System.out.println("Información sobre los animales:");
            // Lógica para mostrar información sobre los animales
        }

        public void mostrarInformacionHabitats() {
            System.out.println("\n========================================");
            System.out.println("Información sobre los hábitats:");
            // Lógica para mostrar información sobre los hábitats
        }

        public void mostrarToursDisponibles() {
            System.out.println("\n========================================");
            System.out.println("Tours disponibles:");
            // Lógica para mostrar los tours disponibles
        }
    }
