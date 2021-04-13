import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = input.nextInt();

        for (int a = 1; a <= value; a++)
            {
            for (int b = 1; b <= a; b++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
