import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        File file = new File("notes.txt");
        FileWriter writer = null;
        FileReader reader = null;

        try {
            // --- Writing characters to a text file ---
            writer = new FileWriter(file); // character output stream
            writer.write("Line 1: Hello from character streams.\n");
            writer.write("Line 2: Java handles Unicode characters here.\n");
            writer.flush(); // ensure data is written

            // --- Reading characters from the same file ---
            reader = new FileReader(file); // character input stream
            int ch;
            System.out.println("Reading from file:");
            while ((ch = reader.read()) != -1) { // read one char
                System.out.print((char) ch); // cast int to char
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}