public class Power {
    public static void main(String[] args) {

        //Given base and n that are both 1 or more,
        //compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

        int base = 3;
        int exponent = 2;

        System.out.println(powerN(3,2));
    }

    public static int powerN (int base, int exponent) {

        if ( exponent != 0 )
            return (base * powerN(base, exponent - 1));
            else return 1;
    }
}

