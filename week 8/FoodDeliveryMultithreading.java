public class FoodDeliveryMultithreading {
    static class FoodTask extends Thread {
        private String activity;

        public FoodTask(String name, String activity, int priority) {
            super(name);
            this.activity = activity;
            setPriority(priority);
        }

        public void run() {
            System.out.println(getName() + " - Priority: " + getPriority() + " - " + activity);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread order = new FoodTask("OrderProcessing", "Processing customer orders", Thread.MAX_PRIORITY);
        Thread delivery = new FoodTask("DeliveryTracking", "Tracking delivery location", Thread.NORM_PRIORITY);
        Thread notification = new FoodTask("Notification", "Sending order-status notification", Thread.MIN_PRIORITY);

        order.start();
        delivery.start();
        notification.start();

        order.join();
        delivery.join();
        notification.join();
    }
}