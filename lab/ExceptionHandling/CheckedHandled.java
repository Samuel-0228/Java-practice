import java.io.File;
import java.io.IOException;

public class CheckedHandled {
    public static void main(String[] args) {
        File myFile = new File("test.txt");

        try {
            System.out.println("Attempting to create file...");
            myFile.createNewFile();      // May throw IOException
            System.out.println("File created successfully!");
        } catch (IOException e) {
            System.out.println("Alert: Could not create file: " + e.getMessage());
        }
    }
}