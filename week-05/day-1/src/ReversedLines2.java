import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedLines2 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("day-1/src/reversed-lines.txt");
        List<String> content = Files.readAllLines(path);

        for (int i = 0; i < content.size(); i++) {
            String line = content.get(i);
            String newLine = "";
            String newOrder = new StringBuilder(line).reverse().toString();
            System.out.println(newOrder);
        }
    }
}
