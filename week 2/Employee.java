public class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = 101;
        e1.name = "Vaidehi";
        e1.salary = 45000;

        e2.id = 102;
        e2.name = "Nandni";
        e2.salary = 50000;

        e1.display();

        System.out.println();

        e2.display();
    }
}