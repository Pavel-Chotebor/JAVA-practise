import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String yourName = input.nextLine();
        System.out.println("HelloUser!");

    }
}
