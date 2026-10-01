import javax.swing.*;
import java.awt.*;

public class StudentRegistrationSystem extends JFrame {
    JTextField nameField = new JTextField(20);
    JTextField registerField = new JTextField(20);
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    JComboBox<String> department = new JComboBox<>(new String[]{"CSE", "ECE", "EEE", "MECH"});

    public StudentRegistrationSystem() {
        setTitle("Student Registration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Student Name:")); add(nameField);
        add(new JLabel("Register Number:")); add(registerField);
        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        ButtonGroup group = new ButtonGroup();
        group.add(male); group.add(female);
        genderPanel.add(male); genderPanel.add(female); add(genderPanel);
        add(new JLabel("Department:")); add(department);

        JButton submit = new JButton("Submit");
        add(new JLabel()); add(submit);

        submit.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected";
            JOptionPane.showMessageDialog(this,
                    "Name: " + nameField.getText() + "\nRegister No: " + registerField.getText()
                    + "\nGender: " + gender + "\nDepartment: " + department.getSelectedItem());
        });
        setVisible(true);
    }

    public static void main(String[] args) { new StudentRegistrationSystem(); }
}