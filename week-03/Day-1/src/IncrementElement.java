public class IncrementElement {
    public static void main(String[] args) {

        /* - Create an array variable named `numbers`
             with the following content: `[1, 2, 3, 4, 5]`
           - Increment the third element
           - Print the third element
        */

        int [] numbers = { 1, 2, 3, 4, 5 };

        numbers [3] = ( numbers [3] + 1 );

        System.out.println ( "the third element is: " + numbers [3] );

    }

}
