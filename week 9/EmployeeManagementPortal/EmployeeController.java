import javax.swing.*;

public class EmployeeController {
    private EmployeeModel model; private EmployeeView view;

    public EmployeeController(EmployeeModel model, EmployeeView view) {
        this.model = model; this.view = view;
        view.login.addActionListener(e -> login());
        view.addEmployee.addActionListener(e -> addEmployee());
        view.viewEmployee.addActionListener(e -> JOptionPane.showMessageDialog(view, model.getEmployeeDetails()));
        view.changePassword.addActionListener(e -> changePassword());
        view.logout.addActionListener(e -> view.showLogin());
        view.exit.addActionListener(e -> System.exit(0));
    }

    private void login() {
        String user = view.username.getText(); String pass = new String(view.password.getPassword());
        if (model.validateLogin(user, pass)) { JOptionPane.showMessageDialog(view, "Login successful."); view.showMainWindow(); }
        else JOptionPane.showMessageDialog(view, "Invalid username or password.");
    }

    private void addEmployee() {
        JTextField id = new JTextField(); JTextField name = new JTextField(); JTextField dept = new JTextField();
        Object[] fields = {"Employee ID:", id, "Employee Name:", name, "Department:", dept};
        if (JOptionPane.showConfirmDialog(view, fields, "Add Employee", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            model.addEmployee(id.getText(), name.getText(), dept.getText());
        }
    }

    private void changePassword() {
        JPasswordField oldP = new JPasswordField(); JPasswordField newP = new JPasswordField(); JPasswordField confirmP = new JPasswordField();
        Object[] fields = {"Old Password:", oldP, "New Password:", newP, "Confirm Password:", confirmP};
        if (JOptionPane.showConfirmDialog(view, fields, "Change Password", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            boolean changed = model.changePassword(new String(oldP.getPassword()), new String(newP.getPassword()), new String(confirmP.getPassword()));
            JOptionPane.showMessageDialog(view, changed ? "Password changed successfully." : "Invalid old password or passwords do not match.");
        }
    }
}