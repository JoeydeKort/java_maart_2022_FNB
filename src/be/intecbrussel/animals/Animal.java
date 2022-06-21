package be.intecbrussel.animals;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private double weight;
    private double height;
    private double length;
    private String sound;
    private int decibel;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weight, double height, double length, int decibel) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.decibel= decibel;
    }

    public void makeNoise() {

    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setDecibel(int decibel) {
        this.decibel = decibel;
    }

    public int getDecibel() {
        return decibel;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", sound='" + sound + '\'' +
                ", decibel=" + decibel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.getWeight(), getWeight()) == 0 && Double.compare(animal.getHeight(), getHeight()) == 0 && Double.compare(animal.getLength(), getLength()) == 0 && Objects.equals(getName(), animal.getName()) && Objects.equals(getSound(), animal.getSound());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), getHeight(), getLength(), getSound());
    }
}
