public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficJunction junction1 = new TrafficJunction(
                "Junction 1", "Heavy Traffic", 1000);
        TrafficJunction junction2 = new TrafficJunction(
                "Junction 2", "Moderate Traffic", 1500);
        TrafficJunction junction3 = new TrafficJunction(
                "Junction 3", "Low Traffic", 2000);

        junction1.setName("Junction 1 Monitor");
        junction2.setName("Junction 2 Monitor");
        junction3.setName("Junction 3 Monitor");

        junction1.start();
        junction2.start();
        junction3.start();

        junction1.join();
        junction2.join();
        junction3.join();

        System.out.println("Traffic monitoring completed.");
    }
}