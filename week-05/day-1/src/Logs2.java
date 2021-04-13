import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs2 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("day-1/src/log.txt");

        List<String> lines = Files.readAllLines(path);
        List<String> logs = new ArrayList<>();
        List<String> ratios = new ArrayList<>();


        System.out.println(getIPs(lines, logs));
        System.out.println(getRatio("29.72.85.71", (ArrayList<String>) lines));

    }

    public static List<String> getIPs(List<String> contentArrayList, List<String> listToSaveIPs) {
        for (String line : contentArrayList) {
            listToSaveIPs.add(line.substring(27, 38));
        }
        return listToSaveIPs;
    }


    public static String getRatio(String ipAdress, ArrayList <String> contentList) {
        String postGet = "";
        for (String line : contentList) {
            if (line.contains(ipAdress)) {
                postGet = line.substring(41, 45);
            }
        }return postGet;
    }
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio from IP adress like input.