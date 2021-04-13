import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter


        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = input.nextInt();

        sum(number);

    }

    public static int sum (int number)
    {
        for (int i=0; i <= number; i++)
            System.out.println(i);

        return number;
    }
}
