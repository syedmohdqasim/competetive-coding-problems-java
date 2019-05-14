package geeksForGeeks;

import org.junit.Test;

public class DiningPhilosopherTest {
    @Test
    public void runWith5Philosophers() throws InterruptedException {
        Chopstick[] chopsticks = new Chopstick[5];
        for (int i = 0; i < 5; i++) {
            chopsticks[i] = new Chopstick();
        }
        Thread t = null;
        for (int i = 0; i < 5; i++) {
            DiningPhilosopher diningPhilosopher = new DiningPhilosopher(chopsticks[i], chopsticks[(i + 1) % 5], i + 1);
            if (i == 1) {
                diningPhilosopher = new DiningPhilosopher(chopsticks[(i + 1) % 5], chopsticks[i], i + 1);
            }
            t = new Thread(diningPhilosopher);
            t.start();

        }
        t.join();

    }
}