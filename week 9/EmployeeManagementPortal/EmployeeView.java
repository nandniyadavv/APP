import javax.swing.*;
import java.awt.*;

public class EmployeeView extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JButton login = new JButton("Login");
    JMenuItem addEmployee = new JMenuItem("Add Employee");
    JMenuItem viewEmployee = new JMenuItem("View Employee");
    JMenuItem changePassword = new JMenuItem("Change Password");
    JMenuItem logout = new JMenuItem("Logout");
    JMenuItem exit = new JMenuItem("Exit Application");

    public EmployeeView() {
        showLogin();
    }

    void showLogin() {
        getContentPane().removeAll();
        setTitle("Employee Login"); setSize(350, 220); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));
        add(new JLabel("Username:")); add(username);
        add(new JLabel("Password:")); add(password);
        add(new JLabel()); add(login);
        revalidate(); repaint(); setVisible(true);
    }

    void showMainWindow() {
        getContentPane().removeAll();
        setTitle("Employee Management Portal"); setSize(500, 300);
        setLayout(new BorderLayout()); add(new JLabel("Welcome to Employee Management Portal", SwingConstants.CENTER));
        JMenuBar bar = new JMenuBar(); JMenu employee = new JMenu("Employee"); JMenu tools = new JMenu("Tools"); JMenu exitMenu = new JMenu("Exit");
        employee.add(addEmployee); employee.add(viewEmployee); tools.add(changePassword); exitMenu.add(logout); exitMenu.add(exit);
        bar.add(employee); bar.add(tools); bar.add(exitMenu); setJMenuBar(bar); revalidate(); repaint();
    }
}