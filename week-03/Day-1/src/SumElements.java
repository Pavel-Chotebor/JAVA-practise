public class SumElements {
    public static void main(String[] args) {

        //   Create an array variable named `numbers`
        //   With the following content: `[54, 23, 66, 12]`
        //   Print the sum of the second and the third element
        //   Sum of all elements

        int numbers [] = { 54, 23, 66, 12 };
        System.out.println( "Sum of the second and the third element is :" + (numbers[2] + numbers[3]) );

        int sumOfElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfElements += numbers[i];
        }
        System.out.println(sumOfElements);

    }
}
