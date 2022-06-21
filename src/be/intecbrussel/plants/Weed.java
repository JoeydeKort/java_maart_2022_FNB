package be.intecbrussel.plants;

public class Weed extends Plant{

    private double area;

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public Weed(String name, double height, double area, Colour colour) {
        super(name, height);
        this.area = area;
        setColour(colour);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void setColour(be.intecbrussel.plants.Colour colour) {
        super.setColour(colour);
    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                "} " + super.toString();
    }
}
