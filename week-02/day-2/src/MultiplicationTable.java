import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = input.nextInt();


        for (int i = 1; i <= 15; i++) {
            System.out.println(value + "*" + i + " = " + (value * i));
            System.out.println("multiplication finished!");
        }
    }

}
