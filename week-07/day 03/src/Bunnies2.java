public class Bunnies2 {
    public static void main(String[] args) {

        //We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
        // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
        // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        System.out.println(count(20));

    }

   /* public static int count(int n1) {
        if (n1 % 2 == 0 && n1 > 1) {
            return 2 + count(n1 - 1);
        } else {
            return 3 + count(n1 - 1);
            //      //return 2;
            // }if (n1 % 2 != 0 && n1 > 1) {
            //       return 3 + count(n1 - 1);
            //   } else {
            //       return 3;
            //   }
        }
    }

    */
}

