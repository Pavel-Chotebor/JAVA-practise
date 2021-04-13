import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        double miles;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a distance in miles:");
        miles = in.nextDouble();

        double kilometers = (miles * 1.6);

        System.out.println ( "Your distance:" + " " + kilometers + "Km");
    }
}
