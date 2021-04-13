public class CompareLength {
    public static void main(String[] args) {

        //   Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
        //   elements than `firstArrayOfNumbers`

        int firstArrayOfNumbers [] = { 1,2,3 };
        int secondArrayOfNumbers [] = { 4,5 };

        System.out.println();

        if ( secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
           System.out.println("secondArrayOfNumbers is longer");
       }

        else {
            System.out.println("firstArrayOfNumbers is longer");
        }

    }
}
