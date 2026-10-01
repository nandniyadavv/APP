import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentCourseManagement extends JFrame {
    JList<String> courseList = new JList<>(new String[]{"Java", "DBMS", "Operating Systems", "Data Structures"});
    DefaultTableModel model = new DefaultTableModel(new String[]{"Student Name", "Selected Course", "Status"}, 0);
    JTable table = new JTable(model);

    public StudentCourseManagement() {
        setTitle("Student Course Management");
        setSize(650, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        add(new JScrollPane(courseList), BorderLayout.WEST);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JTextField studentName = new JTextField(12);
        JButton add = new JButton("Add Course");
        JButton remove = new JButton("Remove Course");
        panel.add(new JLabel("Student:")); panel.add(studentName); panel.add(add); panel.add(remove);
        add(panel, BorderLayout.SOUTH);

        add.addActionListener(e -> {
            String course = courseList.getSelectedValue();
            if (course != null && !studentName.getText().isEmpty())
                model.addRow(new Object[]{studentName.getText(), course, "Enrolled"});
        });
        remove.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) model.removeRow(row);
        });
        setVisible(true);
    }

    public static void main(String[] args) { new StudentCourseManagement(); }
}