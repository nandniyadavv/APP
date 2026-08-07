import java.util.Scanner;

public class EmployeeConstructor {

    int id;
    String name;
    double salary;

    EmployeeConstructor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        EmployeeConstructor emp = new EmployeeConstructor(id, name, salary);

        emp.display();

        sc.close();
    }
}