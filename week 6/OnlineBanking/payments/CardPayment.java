package OnlineBanking.payments;

import OnlineBanking.transactions.OnlineTransaction;

public class CardPayment implements Payment, OnlineTransaction {

    @Override
    public void pay(double amount) {
        System.out.println("Card payment of ₹" + amount + " successful.");
    }
}