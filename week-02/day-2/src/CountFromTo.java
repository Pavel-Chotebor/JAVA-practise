import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = input.nextInt();

        System.out.println("Enter second number: ");
        int n2 = input.nextInt();



        if (n1 > n2 ) {
            System.out.println("The second number should be bigger! ");
        }

        if (n2 > n1) {
            for (int i=n1; i <= n2; i++)
                System.out.println(i);
        }
    }
}
