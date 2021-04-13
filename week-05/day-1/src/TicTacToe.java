import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("day-1/src/win-o.txt");
        List<String> list1 = Files.readAllLines(path);
        char symbol = 's';



        for (int i = 0; i < list1.size(); i++) {


            if ((list1.get(i).charAt(0) == list1.get(i).charAt(1)) && (list1.get(i).charAt(1)) == (list1.get(i).charAt(2))) {// rows logic
                symbol = list1.get(i).charAt(0);

            } else if ((list1.get(0).charAt(i)) == (list1.get(1).charAt(i)) && (list1.get(1).charAt(i)) == (list1.get(2).charAt(i))) { // top bottom logic
                symbol = list1.get(0).charAt(i);

            } else if ((list1.get(0).charAt(0)) == (list1.get(1).charAt(1)) && (list1.get(1).charAt(1)) == (list1.get(2).charAt(2))) { // diagonal logic
                symbol = list1.get(0).charAt(0);
            }
        }

            if (symbol == 'O') {
                System.out.println("O wins");
            } else {
                System.out.println("X wins");
            }
        }
}


