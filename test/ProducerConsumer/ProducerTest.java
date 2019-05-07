package ProducerConsumer;

import org.junit.Test;

import java.util.LinkedList;

public class ProducerTest {
    @Test
    public void testProducerConsumer() throws InterruptedException {
        Object object = new Object();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Thread t1 = new Thread(new Producer(linkedList,5, object));
        Thread t2 = new Thread(new Consumer(linkedList,5,object));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}