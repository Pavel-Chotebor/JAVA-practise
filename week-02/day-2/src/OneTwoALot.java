import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a number: ");
        int value = input.nextInt();


        if (value <= 0) {
            System.out.println("Not enough!");
        }

        if (value == 1) {
            System.out.println("One!");
        }

        if (value == 2) {
            System.out.println("Two!");
        }

        if (value > 2) {
            System.out.println("A lot!");
        }
    }
}
