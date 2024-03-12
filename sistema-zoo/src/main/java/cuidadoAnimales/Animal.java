package cuidadoAnimales;

// Módulo de Cuidado de los Animales
public abstract class Animal {
    private String species;
    private String diet;
    private String healthStatus;
    private String behavior;

    public Animal(String species, String diet) {
        this.species = species;
        this.diet = diet;
        this.healthStatus = "Saludable";
        this.behavior = "Tranquilo";
    }

    public void feed(String food) {
        // Comprueba si la comida proporcionada está en la dieta del animal
        if (this.diet.contains(food)) {
            System.out.println("El " + this.species + " ha sido alimentado con " + food);
        } else {
            System.out.println("El " + this.species + " no puede comer " + food);
        }
    }

    public void checkHealth() {
        // Aquí puedes implementar la lógica para verificar la salud del animal
        if (this.healthStatus.equals("Saludable")) {
            System.out.println("El " + this.species + " está saludable.");
        } else {
            System.out.println("El " + this.species + " no está saludable.");
        }
    }

    public void observeBehavior() {
        // Aquí puedes implementar la lógica para observar el comportamiento del animal
        if (this.behavior.equals("Tranquilo")) {
            System.out.println("El " + this.species + " está tranquilo.");
        } else if (this.behavior.equals("Agitado")) {
            System.out.println("El " + this.species + " está agitado.");
        } else {
            System.out.println("El comportamiento del " + this.species + " es: " + this.behavior);
        }
    }

    // Getters y setters para los atributos

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
        System.out.println("La especie del animal ha sido cambiada a: " + this.species);
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        // Aquí puedes implementar la lógica para establecer la dieta del animal
        this.diet = diet;
        System.out.println("La dieta del " + this.species + " ha sido cambiada a: " + this.diet);
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        System.out.println("El estado de salud del " + this.species + " ha sido cambiado a: " + this.healthStatus);
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
        System.out.println("El comportamiento del " + this.species + " ha sido cambiado a: " + this.behavior);
    }

    // Override del método mostrarInformacion() para mostrar información específica del animal
    public abstract void mostrarInformacion();
}
