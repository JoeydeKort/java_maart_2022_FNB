package be.intecbrussel.plants;

public abstract class Plant {

    private String name;
    private double height;
    private Colour Colour;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Colour getColour() {
        return Colour;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColour(Colour colour) {
        Colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;

        Plant plant = (Plant) o;

        if (Double.compare(plant.getHeight(), getHeight()) != 0) return false;
        if (getName() != null ? !getName().equals(plant.getName()) : plant.getName() != null) return false;
        return getColour() == plant.getColour();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getColour() != null ? getColour().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", Colour=" + Colour +
                '}';
    }
}
