import javax.swing.*;
import java.io.File;

public class JFile {

    public static void main(String[] args) {
        JFileChooser filesChoser = new JFileChooser();

        int result = JOptionPane.showConfirmDialog(null, filesChoser,
                "Please Select a File", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            File selectedFile = filesChoser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            JOptionPane.showMessageDialog(null, "Selected: " + selectedFile.getName());
        }
    }
}
