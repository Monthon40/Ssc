package io.muic.ooc.fab;


public class Rabbit extends Animal {
    // Characteristics shared by all rabbits (class variables).

    // The age at which a rabbit can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a rabbit can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a rabbit breeding.
    private static final double BREEDING_PROBABILITY = 0.25;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;
    // A shared random number generator to control breeding.


    @Override
    protected Location moveToNewLocation() {
        return field.freeAdjacentLocation(location);
    }

    @Override
    protected double getBreedingProbability() {
        return BREEDING_PROBABILITY;
    }

    @Override
    protected int getMaxLitterSize() {
        return MAX_LITTER_SIZE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected int getBreedingAge() {
        return BREEDING_AGE;
    }


}
