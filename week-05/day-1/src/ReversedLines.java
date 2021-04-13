import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {

        reversedText();
    }

    private static void reversedText() {

        Path path = Paths.get("day-1/src/reversed-lines.txt");
        try {
            List<String> content = Files.readAllLines(path);                // získání Listu
            for (int i = 0; i < content.size(); i++) {                      // projede řádky
                    String line = content.get(i);                           // nová String, která získá jednotlivé elementy
                    String reversedString = "";                             // nová String, do které se uloží postupmě jednotlivé char obráceně
                    for (int j = line.length() - 1; j >= 0; j--) {          // for loop k získání char z našich elementů z Array, v obráceném pořadí. -1, protože index od 0
                        reversedString = reversedString + line.charAt(j);   // v for loop se přidá každé písmeno v obráceném pořadí
                    }
                    System.out.println(reversedString);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

