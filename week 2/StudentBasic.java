import java.util.Scanner;

public class StudentBasic {
    String name;
    int rollNo;
    String department;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentBasic s = new StudentBasic();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        s.department = sc.nextLine();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + s.name);
        System.out.println("Roll Number: " + s.rollNo);
        System.out.println("Department: " + s.department);

        sc.close();
    }
}