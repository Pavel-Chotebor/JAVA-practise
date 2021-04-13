import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Lottery {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("week-05/day-1/src/lottery2.csv");
        List<String> content = Files.readAllLines(source);

        List<String> lotteryNumbers = new ArrayList<>();
        String lotteryNumber = "";
        int startingPositionOfNumbers = 14;
        Map<Integer, Integer> mapOfLotteryNumbers = new HashMap<>();





        for (String line : content) {
            //for (int i= 0; i < content.get(i).length(); i ++) {
                lotteryNumber = line.substring(line.length() - startingPositionOfNumbers, line.length());
               // Character.isDigit(!lotteryNumber.charAt(i));
               // if (!lotteryNumber.charAt(i) ==
                lotteryNumbers.add(lotteryNumber);
                // if (!mapOfLotteryNumbers.containsKey(line)) {
                //   mapOfLotteryNumbers.put(line);
                // }
                System.out.println(lotteryNumber);
           // }
        }
    }
}