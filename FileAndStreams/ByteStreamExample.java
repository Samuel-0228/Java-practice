import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        String sourceFile = "input.png";
        String destFile = "CopyOfInput.png";

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(sourceFile); // byte input stream
            out = new FileOutputStream(destFile); // byte output stream

            int data;
            while ((data = in.read()) != -1) { // read one byte
                out.write(data); // write one byte
            }

            System.out.println("Binary copy finished.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
