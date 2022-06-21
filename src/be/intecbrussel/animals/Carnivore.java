package be.intecbrussel.animals;

public class Carnivore extends Animal {

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length, int decibel, String sound) {
        super(name, weight, height, length, decibel);
        this.setMaxFoodSize(maxFoodSize);
        this.setSound(sound);

    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {

        if (getHeight() >= 4.0) {
            System.err.println("This prey is way to high to eat!  ");
            System.exit(-1);
        } else {
            this.maxFoodSize = maxFoodSize;

        }

    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
