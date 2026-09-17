public class BankingTask implements Runnable {
    private String activity;
    private int delay;

    public BankingTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int count = 1; count <= 3; count++) {
                System.out.println(Thread.currentThread().getName()
                        + " - " + activity + " - Execution " + count);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}