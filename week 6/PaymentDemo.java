import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Credit Card payment of ₹" + amount + " successful.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("UPI payment of ₹" + amount + " successful.");
    }
}

class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Net Banking payment of ₹" + amount + " successful.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter payment method: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment();
        } else if (choice == 2) {
            payment = new UPIPayment();
        } else {
            payment = new NetBankingPayment();
        }

        payment.pay(amount);

        sc.close();
    }
}