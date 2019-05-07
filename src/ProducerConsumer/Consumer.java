package ProducerConsumer;

import java.util.LinkedList;

public class Consumer implements Runnable {

    private final int size;
    LinkedList<Integer> queue;
    Object mutex;

    public Consumer(LinkedList<Integer> queue, int size,Object mutex) {
        this.queue = queue;
        this.size = size;
        this.mutex = mutex;
    }


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void consume() throws InterruptedException {
        int data = 0;
        while (true) {
            synchronized (mutex) {
                while (queue.size() <= 0) {
                    mutex.wait();
                }
                queue.removeFirst();
                System.out.println("Consuming  ->" + data + "Queue size" + queue.size());
                mutex.notify();
                Thread.sleep(1000);
            }
        }
    }
}
