package be.intecbrussel.plants;

public class Flower extends Plant {

    private Scent smell;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Flower(String name, double height, Scent smell, Colour colour) {
        super(name, height);
        this.smell = smell;
        setColour(colour);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public void setColour(be.intecbrussel.plants.Colour colour) {
        super.setColour(colour);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "smell=" + smell +
                "} " + super.toString();
    }
}
