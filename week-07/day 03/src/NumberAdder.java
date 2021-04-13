public class NumberAdder {
    public static void main(String[] args) {

        //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

        numberAdder(6);

    }

    public static void numberAdder(int n) {

        //  n =6  ->   1 2 3 4 5 6
        /*if (n == 1) {
            return 1;
        } else {
            //System.out.println(n);
            return numberAdder(n - 1);
        }
        */

        if (n <= 0) {
            return;
        }
        numberAdder(n - 1);
        System.out.println(n + " ");
    }
}




