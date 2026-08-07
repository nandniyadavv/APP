import java.util.Scanner;

public class Rectangle {
    double length;
    double breadth;

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Enter Length: ");
        r.length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        r.breadth = sc.nextDouble();

        r.area();

        sc.close();
    }
}