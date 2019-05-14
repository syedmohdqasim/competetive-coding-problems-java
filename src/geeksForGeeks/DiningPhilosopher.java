package geeksForGeeks;

public class DiningPhilosopher implements Runnable {
    private final Chopstick leftChopstick;
    private final Chopstick rightChopstick;
    private final Integer philosopherNumber;

    DiningPhilosopher(Chopstick leftChopstick, Chopstick rightChopstick, Integer philosopherNumber) {
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
        this.philosopherNumber = philosopherNumber;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (leftChopstick) {
                synchronized (rightChopstick) {
                    System.out.println(philosopherNumber + "   Eating");
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getCause());
            }
        }
    }
}
