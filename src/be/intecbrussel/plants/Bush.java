package be.intecbrussel.plants;

public class Bush extends Plant{

    private LeafType leafType;
    private String fruit;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public Bush(String name, double height, LeafType leafType, String fruit, Colour colour) {
        super(name, height);
        this.leafType = leafType;
        this.fruit = fruit;
        setColour(colour);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public void setColour(be.intecbrussel.plants.Colour colour) {
        super.setColour(colour);
    }

    @Override
    public String toString() {
        return "Bush{" +
                "leafType=" + leafType +
                ", fruit='" + fruit + '\'' +
                "} " + super.toString();
    }

}
