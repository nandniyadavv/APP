public class StudentObjects {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentObjects s1 = new StudentObjects();
        StudentObjects s2 = new StudentObjects();

        s1.name = "Nandni";
        s1.age = 21;

        s2.name = "Vaidehi";
        s2.age = 19;

        System.out.println("Student 1 Details");
        s1.display();

        System.out.println();

        System.out.println("Student 2 Details");
        s2.display();
    }
}