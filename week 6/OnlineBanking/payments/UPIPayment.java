package OnlineBanking.payments;

import OnlineBanking.transactions.OnlineTransaction;

public class UPIPayment implements SecurePayment, OnlineTransaction {

    @Override
    public void pay(double amount) {
        System.out.println("UPI payment of ₹" + amount + " successful.");
    }

    @Override
    public void verifyPayment() {
        System.out.println("UPI payment verified successfully.");
    }
}