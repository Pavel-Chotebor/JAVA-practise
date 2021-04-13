public class SumDigits {
    public static void main(String[] args) {

        //Given a non-negative integer n, return the sum of its digits recursively (without loops).

        int numberToSum = 12345;
        sumDigits(numberToSum);
        System.out.println(sumDigits(numberToSum));
    }

    public static int sumDigits (int n) {
        if (n == 0)
            return 0;
            return (n % 10 + sumDigits(n / 10));
        }
    }
    /*
    Step 1-> 12345 % 10 which is equal-too 5 + ( send 12345/10 to next step )
    Step 2-> 1234 % 10 which is equal-too 4 + ( send 1234/10 to next step )
    Step 3-> 123 % 10 which is equal-too 3 + ( send 123/10 to next step )
    Step 4-> 12 % 10 which is equal-too 2 + ( send 12/10 to next step )
    Step 5-> 1 % 10 which is equal-too 1 + ( send 1/10 to next step )
    Step 6-> 0 algorithm stops
     */

