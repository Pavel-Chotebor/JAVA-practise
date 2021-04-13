public class DiagonalMetrix {
    public static void main(String[] args) {

        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output


        int [] [] numbers = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}
        };

        for (int firstColumn : numbers [0]) {
            System.out.println(firstColumn);

            {  for (int secondColumn : numbers[0])
                System.out.println(secondColumn);
            }


        }


        }
    }


