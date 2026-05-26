import javax.swing.JOptionPane;

public class EasyGUI {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum);

    }

}
