package course;

public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void display() {
        System.out.println("Course Details");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}