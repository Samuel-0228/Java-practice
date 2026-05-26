import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Smallest {
    public static void main(String[] args) {
        // Create text fields for user input
        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);
        JTextField field3 = new JTextField(5);

        // Create a panel and stack fields vertically
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Enter the first number:"));
        panel.add(field1);
        panel.add(Box.createVerticalStrut(10)); // Add spacing
        panel.add(new JLabel("Enter the second number:"));
        panel.add(field2);
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JLabel("Enter the third number:"));
        panel.add(field3);

        // Show the unified dialog card
        int result = JOptionPane.showConfirmDialog(null, panel,
                "Enter Numbers", JOptionPane.OK_CANCEL_OPTION);

        // Process input if the user clicked OK
        if (result == JOptionPane.OK_OPTION) {
            int num1 = Integer.parseInt(field1.getText());
            int num2 = Integer.parseInt(field2.getText());
            int num3 = Integer.parseInt(field3.getText());

            int smallest = Math.min(Math.min(num1, num2), num3);
            JOptionPane.showMessageDialog(null, "The smallest number is: " + smallest);
        }
    }
}
