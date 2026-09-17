public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread timeThread = new Thread(
                new OnlineExamTask("Displaying remaining time", 1000));
        Thread saveThread = new Thread(
                new OnlineExamTask("Auto-saving student's answers", 1500));
        Thread networkThread = new Thread(
                new OnlineExamTask("Checking network connection", 2000));

        timeThread.setName("Time Monitor");
        saveThread.setName("Auto Save");
        networkThread.setName("Network Monitor");

        timeThread.start();
        saveThread.start();
        networkThread.start();

        timeThread.join();
        saveThread.join();
        networkThread.join();

        System.out.println("Online examination activities completed.");
    }
}