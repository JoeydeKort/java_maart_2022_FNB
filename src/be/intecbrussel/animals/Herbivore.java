package be.intecbrussel.animals;

import be.intecbrussel.plants.Plant;

import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length, int decibel, String sound) {
        super(name, weight, height, length, decibel);
        this.setSound(sound);
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
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "} " + super.toString();
    }

}
