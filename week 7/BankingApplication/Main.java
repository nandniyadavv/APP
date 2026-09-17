public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread transactionThread = new Thread(
                new BankingTask("Transaction processing", 1000));
        Thread balanceThread = new Thread(
                new BankingTask("Balance updating", 1500));
        Thread smsThread = new Thread(
                new BankingTask("SMS notification", 2000));

        transactionThread.setName("Transaction Thread");
        balanceThread.setName("Balance Thread");
        smsThread.setName("SMS Thread");

        transactionThread.start();
        balanceThread.start();
        smsThread.start();

        transactionThread.join();
        balanceThread.join();
        smsThread.join();

        System.out.println("Banking activities completed.");
    }
}