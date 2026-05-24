import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class TextFile {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        FileWriter writer = null;
        FileReader reader = null;

        // write = new FileWriter(file);

        try {
            writer = new FileWriter(file);
            writer.write("hello");
            writer.flush();
            reader = new FileReader(file);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Could not write " + e.getMessage());
        }

    }
}
