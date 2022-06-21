package be.intecbrussel.animals;

import be.intecbrussel.plants.Plant;

import java.util.Set;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length, int decibel, String sound) {
        super(name, weight, height, length, decibel);
        this.setSound(sound);
    }

    public void addPlantToDiet(Plant plant) {

    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Omnivore)) return false;
        if (!super.equals(o)) return false;

        Omnivore omnivore = (Omnivore) o;

        if (Double.compare(omnivore.maxFoodSize, maxFoodSize) != 0) return false;
        return getPlantDiet() != null ? getPlantDiet().equals(omnivore.getPlantDiet()) : omnivore.getPlantDiet() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getPlantDiet() != null ? getPlantDiet().hashCode() : 0);
        temp = Double.doubleToLongBits(maxFoodSize);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
