import javax.swing.*;
import java.awt.*;

public class UserLoginPreferences extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JCheckBox remember = new JCheckBox("Remember Me");
    JCheckBox notifications = new JCheckBox("Receive Notifications");

    public UserLoginPreferences() {
        setTitle("User Login");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Username:")); add(username);
        add(new JLabel("Password:")); add(password);
        add(remember); add(notifications);
        JButton login = new JButton("Login"); add(new JLabel()); add(login);

        login.addActionListener(e -> {
            String user = username.getText();
            String pass = new String(password.getPassword());
            if (user.equals("admin") && pass.equals("admin123"))
                JOptionPane.showMessageDialog(this, "Login successful!");
            else
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
        });
        setVisible(true);
    }

    public static void main(String[] args) { new UserLoginPreferences(); }
}