import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WriteSingleLine {

    public static void main(String[] args) {


        //File file = new File ("test.txt");

        //System.out.println(file.canWrite());


        //Files.isReadable(path);
        //Files.isWritable(path);
        try {

            String name = "Pavel";

            Path path = Paths.get("test.txt");
            Files.write(path, Collections.singleton(name));
        } catch (Exception e) {
            System.out.println("unable to wtire the file: test.txt");
        }











    }

  /*  public static void  writeSingleLine () throws IOException {

        String myName = "Pavel";
        Path path = Paths.get("test.txt");
       // BufferedWriter writer = new BufferedWriter( new FileWriter("test.txt", true));
       // writer.append(' ');
        //writer.write(myName);

        //writer.close();
        Files.write(path, myName);
*/

    }



