import java.util.Scanner;

public class DivideByZero2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a divisor:");
        int divisor = input.nextInt();


        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail!");
        }
    }
}
