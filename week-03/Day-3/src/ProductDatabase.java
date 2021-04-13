import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ProductDatabase {

    public static void main(String[] args) {

        HashMap<String, Integer> foodDatabase = new HashMap<>();


        foodDatabase.put("Eggs", 200);
        foodDatabase.put("milk", 200);
        foodDatabase.put("fish", 400);
        foodDatabase.put("apples", 150);
        foodDatabase.put("bread", 50);
        foodDatabase.put("chicken", 550);


        System.out.println("price of fish is: " + foodDatabase.get("fish"));

        int max = foodDatabase.values().stream().max(Integer::compareTo).get();
        System.out.println(max);


        int min = foodDatabase.values().stream().min(Integer::compareTo).get();
        System.out.println(min);


        int maxPrice = (Collections.max(foodDatabase.values()));
        for (Map.Entry<String, Integer> entry : foodDatabase.entrySet()) {
            if (entry.getValue() == maxPrice) {
                System.out.println("Most expensive item is: " + entry.getKey());
            }
            int minPrice = (Collections.min(foodDatabase.values()));
            if (entry.getValue() == minPrice) {
                System.out.println("The cheapest item is: " + entry.getKey());
            }
        }

        int sum = 0;
        for (int value : foodDatabase.values()) {
            sum += value;
        }
        System.out.println(sum / foodDatabase.values().size());

        int itemCounterUnder300 = 0;
        for (int value : foodDatabase.values()) {
            if (value < 300) {
                itemCounterUnder300++;
            }
        }
        System.out.println("Number items bellow 300: " + itemCounterUnder300);

    }
}