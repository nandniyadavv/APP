import java.util.Scanner;

abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;

        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}

class Electronics extends Product {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.15;
    }
}

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Books");

        System.out.print("Enter category: ");
        int choice = sc.nextInt();

        Product product;

        if (choice == 1) {
            product = new Electronics(id, name, price);
        } else if (choice == 2) {
            product = new Clothing(id, name, price);
        } else {
            product = new Books(id, name, price);
        }

        product.display();

        sc.close();
    }
}