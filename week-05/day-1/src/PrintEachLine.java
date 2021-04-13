import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {

        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"


        Path path = Paths.get("my-file.txt");

        try {
            List<String> content = Files.readAllLines(path);
            System.out.println(content);
        } catch (Exception ex) {
            System.out.println("Unable to read file:" + path);
        }
    }
}
