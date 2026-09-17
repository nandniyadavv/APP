public class TrafficJunction extends Thread {
    private String trafficStatus;
    private int delay;

    public TrafficJunction(String name, String trafficStatus, int delay) {
        super(name);
        this.trafficStatus = trafficStatus;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " - Traffic Status: "
                        + trafficStatus + " - Report " + i);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
    }
}