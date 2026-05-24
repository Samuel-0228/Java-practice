import javax.swing.JOptionPane;

public class EasyGUI {
    public static void main(String[] name) {
        String num1 = JOptionPane.showInputDialog("Enter the first number:");
        String num2 = JOptionPane.showInputDialog("Enter the second number");
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null, "The sum of the two numbers is: " + sum);

    }

}