package theGardenApplication;

public abstract class Plant {

    protected String color;
    protected double waterAmount;
    protected double waterCoeficcient;
    protected int minimalValueOfWater;

    public Plant (String color, double waterCoeficcient, int minimalValueOfWater) {
        this.waterAmount = 0;
        this.color = color;
        this.waterCoeficcient = waterCoeficcient;
        this.minimalValueOfWater = minimalValueOfWater;
    }

    public abstract String getType ();
}
