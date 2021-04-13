package theGardenApplication;

public class Flower extends Plant  {

    public Flower(String color) {
        super(color, 0.40, 5);
    }

    @Override
    public String getType() {
        return this.color + " flower";
    }
}