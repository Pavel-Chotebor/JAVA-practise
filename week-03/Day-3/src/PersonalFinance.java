import java.util.*;

public class PersonalFinance {

    private int acounter;

    public static void main(String[] args) {

        ArrayList <Integer> expenses = new ArrayList<>();

        expenses.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));


        int sum = 0;
        for (int counter = 0; counter < expenses.size(); counter++) {
            sum += expenses.get(counter);
        }
        System.out.println("Total expenses: " + sum);

        System.out.println("The greatest expense is: " +Collections.max(expenses));
        System.out.println("The cheapest expense is: " + Collections.min(expenses));

        int average = (sum / expenses.size());

        System.out.println("Average spending: " + average);

        }

}











