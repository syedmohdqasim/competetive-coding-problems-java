package geeksForGeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumer {
    public static List<Integer> queue = new ArrayList<Integer>();
    static int size = 5;

    void produce() throws InterruptedException {
        System.out.println("Started" + Thread.currentThread());
        int data = 0;

        while (true) {
            synchronized (queue) {
                while (queue.size() >= size) {
                    queue.wait();
                }
                System.out.println("Producer producing ->" + data + "Queue size" + queue.size());
                queue.add(++data);
                queue.notify();
            }
        }
    }

    void consume() throws InterruptedException {
        System.out.println("Started" + Thread.currentThread());
        while (true) {
            synchronized (queue) {
                while (queue.size() <= 0) {
                    queue.wait();
                }
                Integer data = queue.get(queue.size() - 1);
                System.out.println("Consumer consuming ->" + data + "Queue size" + queue.size());
                queue.remove(queue.size() - 1);
                queue.notify();
            }
        }
    }

}
