import course.Course;
import java.util.Scanner;
import student.Student;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = sc.nextLine();

        Student student = new Student(studentName, rollNo);
        Course course = new Course(courseName, courseCode);

        student.display();
        course.display();

        sc.close();
    }
}