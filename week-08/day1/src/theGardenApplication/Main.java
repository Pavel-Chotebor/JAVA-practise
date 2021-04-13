package theGardenApplication;

public class Main {

    public static void main(String[] args) {

        Plant blueFlower = new Flower("blue");
        Plant yellowFlower = new Flower("yellow");

        Plant purpleTree = new Tree("purple");
        Plant orangeTree = new Tree("orange");

        Garden garden = new Garden();

        garden.add(blueFlower);
        garden.add(yellowFlower);

        garden.add(purpleTree);
        garden.add(orangeTree);

        garden.checkWaterStatusOfGarden();

        garden.watering(40);
        garden.watering(70);
    }
}
