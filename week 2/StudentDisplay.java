import java.util.Scanner;

public class StudentDisplay {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDisplay s = new StudentDisplay();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();

        System.out.println("\nStudent Details");
        s.display();

        sc.close();
    }
}