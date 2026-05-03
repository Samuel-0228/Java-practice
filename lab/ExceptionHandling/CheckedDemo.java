import java.io.File;
import java.io.IOException;

public class CheckedDemo {
    public static void main(String[] args) {
        File myFile = new File("test.txt");

        // myFile.createNewFile(); // Compile-time error: unreported IOException
    }
}