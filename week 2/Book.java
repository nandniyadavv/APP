import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter Book Title: ");
        b.title = sc.nextLine();

        System.out.print("Enter Author: ");
        b.author = sc.nextLine();

        System.out.print("Enter Price: ");
        b.price = sc.nextDouble();

        System.out.println("\nBook Details");
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Price: " + b.price);

        sc.close();
    }
}