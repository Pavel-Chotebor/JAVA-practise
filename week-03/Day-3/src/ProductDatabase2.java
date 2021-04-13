import java.util.*;

public class ProductDatabase2 {

    public static void main(String[] args) {


        Map<String, Integer> foodList = new HashMap<>();

        foodList.put("Eggs", 200);
        foodList.put("Milk", 200);
        foodList.put("Fish", 400);
        foodList.put("Apples", 150);
        foodList.put("Bread", 50);
        foodList.put("Chicken", 500);

        List<String> productsLessThan201 = new ArrayList<>();
        List<String> productsMoreThan150 = new ArrayList<>();
        int limitLessThan201 = 201;
        int limitMoreThan150 = 150;

        for (Map.Entry<String, Integer> entry : foodList.entrySet()) {
            if (limitLessThan201 > entry.getValue()) {
                productsLessThan201.add(entry.getKey());
            }
        }
        System.out.println(productsLessThan201);


        for (Map.Entry<String, Integer> entry : foodList.entrySet()) {
            if (limitMoreThan150 < entry.getValue()) {
                productsMoreThan150.add(entry.getKey());
            }
        }
        System.out.println(productsMoreThan150);
    }
}


//Which products cost less than 201? (just the name)
//Which products cost more than 150? (name + price)
