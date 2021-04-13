package theGardenApplication;

public class Tree extends Plant {

    public Tree(String color) {
        super(color, 0.75, 10);
    }

    @Override
    public String getType() {
        return  this.color + " tree";
    }
}