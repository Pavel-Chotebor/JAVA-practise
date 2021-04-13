import java.text.DecimalFormat;

public class BMI {
    public static void main(String[] args) {

        double massInKg = 81.2;
        double heightInm = 1.78;
        double squareHeightInm = (heightInm * heightInm);


        System.out.println("Your BMI is: " + massInKg / squareHeightInm  + "!");

    }
}

