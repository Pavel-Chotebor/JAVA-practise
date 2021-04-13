import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number which you want  to divide by 10:");
        int divisor = input.nextInt();

        try {
            divideFunction(divisor);
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("fail");

        }
    }

    private static int divideFunction(int divisor) {

        int numberToDivide = 10;
        System.out.println ( numberToDivide / divisor );
        return divisor;
    }
}


    /*Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();

    try { // Prevents the program breaking when attempting dividing by zero
            int result = 12 / divisor; // If the input value for divisor was 0 it stops the try block
            System.out.println(result); // The program doesn't reach this line if the input was 0
            } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
            }
            }
            }
*/
