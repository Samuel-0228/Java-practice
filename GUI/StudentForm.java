import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentForm extends JFrame {

    public StudentForm() {
        setTitle("Student Registration");
        setSize(400, 200);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel mainContent = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JTextField nameField = new JTextField(25);
        JTextField idField = new JTextField(25);
        JTextField deptField = new JTextField(25);

        JButton submitBtn = new JButton("Register");

        mainContent.add(new JLabel("Full Name:"));
        mainContent.add(nameField);
        mainContent.add(new JLabel("Id Number: "));
        mainContent.add(idField);
        mainContent.add(new JLabel("Department:"));
        mainContent.add(deptField);
        mainContent.add(submitBtn);

        add(mainContent, BorderLayout.CENTER);

        JLabel statusLabel = new JLabel("Status: Waiting ...");
        add(statusLabel, BorderLayout.SOUTH);

        submitBtn.addActionListener(e -> {
            if (nameField.getText().isEmpty() || idField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in name and ID!");
            } else {
                statusLabel.setText("Register: " + nameField.getText());
                statusLabel.setForeground(new Color(0, 100, 0));
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
