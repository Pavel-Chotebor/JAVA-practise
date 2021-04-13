import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {

        reversedOrder();

    }

    private static void reversedOrder() {

        Path path = Paths.get("day-1/src/reversed-order.txt");

        try {
            List<String> content = Files.readAllLines(path);
            Collections.reverse(content);                                   // jednotlivé elementy zobrazí pozpátku

            for (int i = 0; i<content.size(); i++) {                        // zobrazení elementů bez arraylistu, jako text
                System.out.println(content.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
