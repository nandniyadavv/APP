import javax.swing.*;

public class StudentGradeController {
    public StudentGradeController(StudentGradeModel model, StudentGradeView view) {
        view.calculate.addActionListener(e -> {
            try {
                model.calculate(view.name.getText(), Integer.parseInt(view.mark1.getText()),
                        Integer.parseInt(view.mark2.getText()), Integer.parseInt(view.mark3.getText()));
                view.result.setText("Total: " + model.getTotal() + ", Average: "
                        + String.format("%.2f", model.getAverage()) + ", Grade: " + model.getGrade());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Enter valid marks.");
            }
        });
    }
}