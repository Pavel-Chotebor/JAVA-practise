import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<String> shoppinglist = new ArrayList<>();
        shoppinglist.addAll(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));

       /* Do we have milk on the list?
          Do we have bananas on the list? */

        if (shoppinglist.contains("milk")) {
            System.out.println("Milk is already in you shopping list! ");
        } else System.out.println("You forget add milk!");


        if (shoppinglist.contains("bananas")) {
            System.out.println("Bananas are already in you shopping list ");
        }
        else System.out.println("You forget add bananas!");

        }
    }


