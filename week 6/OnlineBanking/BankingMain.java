package OnlineBanking;

import OnlineBanking.accounts.Account;
import OnlineBanking.accounts.CurrentAccount;
import OnlineBanking.accounts.SavingsAccount;
import OnlineBanking.payments.CardPayment;
import OnlineBanking.payments.Payment;
import OnlineBanking.payments.UPIPayment;
import OnlineBanking.transactions.OnlineTransaction;
import java.util.Scanner;

public class BankingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE BANKING SYSTEM =====");

        System.out.print("\nEnter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.println("\nSelect account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        System.out.print("Enter choice: ");
        int accountChoice = sc.nextInt();

        Account account;

        if (accountChoice == 1) {
            account = new SavingsAccount(
                accountNumber, accountHolder, balance
            );
        } else {
            account = new CurrentAccount(
                accountNumber, accountHolder, balance
            );
        }

        System.out.println("\n===== ACCOUNT DETAILS =====");
        account.displayDetails();

        System.out.println("\nSelect payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");

        System.out.print("Enter choice: ");
        int paymentChoice = sc.nextInt();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        if (paymentChoice == 1) {
            payment = new UPIPayment();
        } else {
            payment = new CardPayment();
        }

        System.out.println("\n===== PAYMENT DETAILS =====");

        payment.pay(amount);

        if (payment instanceof UPIPayment) {
            UPIPayment upi = (UPIPayment) payment;
            upi.verifyPayment();
        }

        if (payment instanceof OnlineTransaction) {
            System.out.println("This is an online transaction.");
        }

        sc.close();
    }
}