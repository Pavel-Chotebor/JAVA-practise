import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Writesingle2 {
    public static void main(String[] args) {

        writeSingleLine();

    }

    private static void writeSingleLine() {

        String name = "Pavel Chotěbor";
        List<String> content = new ArrayList<>();
        try {
            content.add(name);

            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("could not write the file!");
        }
    }
}