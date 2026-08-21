import java.util.Scanner;

class Employee {
    String name;
    int id;
    double basicSalary;

    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class Professor extends Employee {
    Professor(String name, int id, double basicSalary) {
        super(name, id, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 20000;
    }
}

class LabAssistant extends Employee {
    LabAssistant(String name, int id, double basicSalary) {
        super(name, id, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 10000;
    }
}

class AdministrativeStaff extends Employee {
    AdministrativeStaff(String name, int id, double basicSalary) {
        super(name, id, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 5000;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        Employee professor = new Professor(name, id, salary);
        Employee labAssistant = new LabAssistant(name, id, salary);
        Employee admin = new AdministrativeStaff(name, id, salary);

        System.out.println("Professor Salary: " + professor.calculateSalary());
        System.out.println("Lab Assistant Salary: " + labAssistant.calculateSalary());
        System.out.println("Administrative Staff Salary: " + admin.calculateSalary());

        sc.close();
    }
}