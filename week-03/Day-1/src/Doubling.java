import org.w3c.dom.ls.LSOutput;

public class Doubling {

    public static void main(String[] args) {

        /* - Create an integer variable named `baseNum` and assign the value `123` to it
           - Create a function called `doubling` that doubles it's input parameter and returns with an integer
           - Print the result of `doubling(baseNum)`
        */

        int baseNumb = 123;
        doubling(baseNumb);

    }

    public static int doubling (int doublingValue)

    {
        System.out.println ( (doublingValue * 2) );
        return doublingValue;
    }

}
