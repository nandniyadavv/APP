import javax.swing.*;
import java.awt.*;

public class StudentGradeView extends JFrame {
    JTextField name = new JTextField(15);
    JTextField mark1 = new JTextField(15);
    JTextField mark2 = new JTextField(15);
    JTextField mark3 = new JTextField(15);
    JButton calculate = new JButton("Calculate Result");
    JLabel result = new JLabel(" ");

    public StudentGradeView() {
        setTitle("Student Grade Calculator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));
        add(new JLabel("Student Name:")); add(name);
        add(new JLabel("Subject 1:")); add(mark1);
        add(new JLabel("Subject 2:")); add(mark2);
        add(new JLabel("Subject 3:")); add(mark3);
        add(new JLabel()); add(calculate);
        add(new JLabel("Result:")); add(result);
        setVisible(true);
    }
}