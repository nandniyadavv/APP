import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Enter Temperature in Celsius: ");
        celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}