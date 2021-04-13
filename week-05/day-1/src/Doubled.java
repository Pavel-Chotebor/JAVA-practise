import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {

        // Create a method that decrypts the duplicated-chars.txt 

        decryptsIt();
    }

    private static void decryptsIt() {



        try {
            Path path = Paths.get("day-1/src/duplicated-chars.txt");
            List<String> content = Files.readAllLines(path);


            for (int i = 0; i < content.size(); i++) {                 //čtení všech řádků
                for (int j=0; j < content.get(i).length(); j++) {      //čtení každého písmena
                    String line = content.get(i);                 // vytvoření nové String line, k získaní indexu i
                    if (line.charAt(j) == line.charAt(j+1)) {          //když pozice j = pozice j+1, print jen j
                        System.out.print(line.charAt(j));
                        j++;                                           // j se zvyšuje, aby se přešlo na daší písmeno
                    }
                }
                System.out.println();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
