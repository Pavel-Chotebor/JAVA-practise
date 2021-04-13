import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(" Number is even! ");

        else
            System.out.println(" Number is odd! ");
    }
}
