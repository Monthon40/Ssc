package io.muic.ooc.fab;

public enum AnimalType {
    RABBIT(0.08, Rabbit.class),
    FOX(0.02, Fox.class);

    private double breedingProbability;

    private Class animalClass;

    AnimalType(double breedingProbability, Class animalClass){
        this.breedingProbability = breedingProbability;
        this.animalClass = animalClass;
    }

    public double getBreedingProbability() {
        return breedingProbability;
    }

    public Class getAnimalClass() {
        return animalClass;
    }
}
