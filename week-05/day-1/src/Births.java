import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Births {

    public static void main(String[] args) throws IOException {


        Path path = Paths.get("day-1/src/births.csv");
        List<String> content = Files.readAllLines(path);
        String lines = "";
        int indexOfFirstSemicolon;
        String year = "";
        Map<String, Integer> yearOccurencies = new HashMap<>();
        int countMax = 0;
        int countSecondMax = 0;
        int countThirdMax = 0;
        String yearCount = "";


        //  promenne do forloopu


        for (int i = 0; i < content.size(); i++) {
            lines = content.get(i);
            indexOfFirstSemicolon = lines.indexOf(";");
            year = lines.substring(indexOfFirstSemicolon + 1, indexOfFirstSemicolon + 5);
            if (!yearOccurencies.containsKey(year)) {
                yearOccurencies.put(year, 1);
            } else if (yearOccurencies.containsKey(year)) {
                yearOccurencies.put(year, yearOccurencies.get(year).intValue() + 1);
            }
        }

        for (var entry : yearOccurencies.entrySet()) {
            if (countMax < entry.getValue()) {
                countMax = entry.getValue();
                yearCount = entry.getKey();
            }
        }
        System.out.println("most common year is: " + yearCount + " with count of :" + countMax);
    }
}








/*
        final Map<String, Integer> mostCommonYear = yearOccurencies.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(mostCommonYear);
        }


 */