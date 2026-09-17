package student;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void display() {
        System.out.println("Student Details");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}