public class SymamtricMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}
        };
        isSymetric(matrix);
        System.out.println(isSymetric(matrix));
        //  if(matrix [0][1] == matrix [1][0])      && matrix [0][2] == matrix [2][0]     && matrix [1][2] == matrix [2][1])

        //if (matrix [i][i+1] == matrix [i + 1]);
        /*
        if ((matrix [i][i+1] == matrix [i + 1][i])  && (matrix [i][2] == matrix [2][i])  ) {
                    System.out.println("symetric");
                }
         */

    }

    public static boolean isSymetric (int matrix[][]) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix [i][j] != matrix[j][i]) {
                        return false;
                    }
                }
            } return true;
        }
}
