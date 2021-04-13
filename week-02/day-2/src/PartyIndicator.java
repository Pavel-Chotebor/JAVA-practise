import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of girls: ");

        int girls = input.nextInt();
        System.out.println("Enter number of boys :");

        int boys = input.nextInt();



        if (girls == boys && girls + boys > 20) {
            System.out.println("The party is excellent!");
        }
        else if (girls + boys > 20 && girls != 0) {
            System.out.println("Quite good party! ");
        }
        if (girls + boys < 20 && girls != 0) {
            System.out.println("Average party...");
        }

        if (girls == 0 ) {
            System.out.println("Sausage party!");
        }
    }
}
