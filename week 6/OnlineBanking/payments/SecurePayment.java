package OnlineBanking.payments;

public interface SecurePayment extends Payment {
    void verifyPayment();
}