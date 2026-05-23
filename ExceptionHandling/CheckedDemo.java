import java.io.File;
import java.io.IOException;

public class CheckedDemo {
    public static void main(String[] args) {
        File myFile = new File("test.txt");

        try {
            System.out.println("Attempting to create file...");
            if (myFile.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                throw new IOException("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Alert: Could not create file: " + e.getMessage());
        } finally {
            System.out.println("File operation finished.");
        }
    }
}