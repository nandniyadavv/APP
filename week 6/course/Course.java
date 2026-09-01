package course;

public class Course {
    String courseName;
    String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void display() {
        System.out.println("\nCourse Details");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}