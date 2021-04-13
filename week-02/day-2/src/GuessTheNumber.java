import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int number = input.nextInt();

        int storedNumber = 10;

        if (number == storedNumber) {
            System.out.println("You found the number: 10!");
        }

        if (number > storedNumber) {
            System.out.println("Stored number is lower! ");
        }

        if (number < storedNumber) {
            System.out.println("Stored number is higher! ");
        }
    }
}
