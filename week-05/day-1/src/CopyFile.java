import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        // musí být specifikováno z root složky (week-05), do day a src!
        copyFile("day-1/src/File1.txt", "day-1/src/File2.txt");

    }

    private static void copyFile(String copyFrom, String copyWhere) {

        // získání cest:
        Path copyFromPath = Paths.get(copyFrom);
        Path copyWherePath = Paths.get(copyWhere);

        try {

            // uložení obsahu 1. souboru do list
            List <String> content = Files.readAllLines(copyFromPath);

            // zapsání kam, a co(již zapsaný list))
            Files.write(copyWherePath, content);

            System.out.println(copyFrom + "is copied to: " + copyWhere);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

