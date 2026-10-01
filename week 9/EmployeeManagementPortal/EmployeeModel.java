public class EmployeeModel {
    private String password = "admin123";
    private String employeeId, employeeName, department;

    public boolean validateLogin(String username, String enteredPassword) {
        return username.equals("admin") && enteredPassword.equals(password);
    }

    public boolean changePassword(String oldPassword, String newPassword, String confirmPassword) {
        if (!password.equals(oldPassword) || !newPassword.equals(confirmPassword)) return false;
        password = newPassword;
        return true;
    }

    public void addEmployee(String id, String name, String dept) {
        employeeId = id; employeeName = name; department = dept;
    }

    public String getEmployeeDetails() {
        if (employeeId == null) return "No employee added.";
        return "Employee ID: " + employeeId + "\nName: " + employeeName + "\nDepartment: " + department;
    }
}