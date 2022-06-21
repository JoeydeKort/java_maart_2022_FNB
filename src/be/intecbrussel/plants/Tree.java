package be.intecbrussel.plants;

public class Tree extends Plant{

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public Tree(String name, double height, LeafType leafType, Colour colour) {
        super(name, height);
        this.leafType = leafType;
        setColour(colour);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public void setColour(be.intecbrussel.plants.Colour colour) {
        super.setColour(colour);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                "} " + super.toString();
    }

}
