package theGardenApplication;
import java.util.ArrayList;


public class Garden {

    protected int needsWater;
    protected int waterAmountForPlantWhichNeedsWater;
    protected ArrayList<Plant> plants = new ArrayList<>();


    public void add (Plant plant) {
        plants.add(plant);
    }


    public void checkWaterStatusOfGarden() {
        for (Plant plant : plants) {
            if (plant.waterAmount < plant.minimalValueOfWater) {
                System.out.println(plant.getType() + " needs water.");
            } else System.out.println(plant.getType() + " doesn't need water.");
        }
    }

    public void getNumberOfNeedWaterPlants () {
        this.needsWater = 0;
        for (Plant plant : plants) {
            if (plant.waterAmount < plant.minimalValueOfWater) {
                needsWater++;
            }
        }
    }


    public void watering(int gardenWateringAmount) {
        System.out.println();
        System.out.println("Watering with: " + gardenWateringAmount);

        getNumberOfNeedWaterPlants();
        waterAmountForPlantWhichNeedsWater = (gardenWateringAmount /needsWater);

        for (Plant plant : plants) {
            if (plant.waterAmount < plant.minimalValueOfWater) {
                plant.waterAmount +=  (waterAmountForPlantWhichNeedsWater * plant.waterCoeficcient);
            }
        }
        checkWaterStatusOfGarden();
    }
}